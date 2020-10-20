package cn.xzxy.lewy.circleachieve.controller;

import cn.xzxy.lewy.circleachieve.api.CountryApi;
import cn.xzxy.lewy.circleachieve.aspect.OpLog;
import cn.xzxy.lewy.circleachieve.dto.country.CountryDetailReq;
import cn.xzxy.lewy.circleachieve.pojo.Country;
import cn.xzxy.lewy.circleachieve.service.CountryService;
import cn.xzxy.lewy.framework.core.model.JsonResponseEntity;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.concurrent.TimeUnit;

@Api(value = "国家管理接口")
@RestController
@RequestMapping("/rest/country")
@Slf4j
public class CountryController implements CountryApi {

    @Resource
    RedissonClient redissonClient;

    @Resource
    private CountryService countryService;

    @PostMapping("detail")
    @ApiOperation(value = "查询国家详情", notes = "查询国家详情")
    @OpLog(methodCode = "getCountry", methodName = "获取国家信息")
    public JsonResponseEntity getCountry(@RequestBody @Valid CountryDetailReq countryDetailReq) {

        return JsonResponseEntity.buildOK(countryService.getCountry(countryDetailReq.getCountryId()));
    }

    @PostMapping("/detailWithCache")
    public JsonResponseEntity getCountryWithCache(@RequestBody CountryDetailReq countryDetailReq) {

        String jsonStr = null;
        RBucket<String> rCache = redissonClient.getBucket("ACHIEVE_COUNTRY_" + countryDetailReq.getCountryId());
        if (rCache.isExists()) {
            log.info("============读取服务详情缓存成功，国家编号{}============", countryDetailReq.getCountryId());
            jsonStr = rCache.get();
        } else {
            // 不存在则查询数据库，并且放入redis
            log.info("============缓存中没有该服务详情数据，进行数据库查询============");
            Country country = countryService.getCountry(countryDetailReq.getCountryId());
            jsonStr = JSONObject.toJSONString(country);
            // 写入缓存，过期时间为1h
            rCache.set(jsonStr, 1, TimeUnit.HOURS);
            log.info("============写入服务详情缓存成功，国家编号{}============", countryDetailReq.getCountryId());
        }
        return JsonResponseEntity.buildOK(JSONObject.parse(jsonStr));
    }
}

