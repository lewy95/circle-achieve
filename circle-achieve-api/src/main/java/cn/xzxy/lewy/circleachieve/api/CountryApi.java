package cn.xzxy.lewy.circleachieve.api;

import cn.xzxy.lewy.circleachieve.dto.country.CountryDetailReq;
import cn.xzxy.lewy.framework.core.model.JsonResponseEntity;
import cn.xzxy.lewy.framework.openfeign.handler.UnMappingHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @author lewy95
 */
@Api(value = "国家信息API接口")
@FeignClient(name = "country",
        url= "localhost:8082/circle-provider/rest/country",
        configuration = UnMappingHandler.class)
// name >>> 注册中心名称，用于服务发现
// url  >>> 可以指定路径，用于本地调试
// configuration = UnMappingHandler.class >>> 用于表示不走加签方式
public interface CountryApi {

    @PostMapping(value = "/detail", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "detail", notes = "获取国家详情")
    JsonResponseEntity getCountry(@RequestBody @Valid CountryDetailReq countryDetailReq);
}
