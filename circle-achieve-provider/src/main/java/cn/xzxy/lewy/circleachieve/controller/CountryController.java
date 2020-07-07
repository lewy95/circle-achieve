package cn.xzxy.lewy.circleachieve.controller;

import cn.xzxy.lewy.circleachieve.api.CountryApi;
import cn.xzxy.lewy.circleachieve.aspect.OpLog;
import cn.xzxy.lewy.circleachieve.dto.country.CountryDetailReq;
import cn.xzxy.lewy.circleachieve.service.CountryService;
import cn.xzxy.lewy.framework.core.model.JsonResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@Api(value = "国家管理接口")
@RestController
@RequestMapping("/rest/country")
public class CountryController implements CountryApi {

    @Resource
    private CountryService countryService;

    @PostMapping("detail")
    @ApiOperation(value = "查询国家详情", notes = "查询国家详情")
    @OpLog(methodCode = "getCountry", methodName = "获取国家信息")
    public JsonResponseEntity getCountry(@RequestBody @Valid CountryDetailReq countryDetailReq) {

        return JsonResponseEntity.buildOK(countryService.getCountry(countryDetailReq.getCountryId()));
    }
}

