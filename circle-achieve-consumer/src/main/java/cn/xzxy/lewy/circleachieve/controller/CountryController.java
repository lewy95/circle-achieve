package cn.xzxy.lewy.circleachieve.controller;

import cn.xzxy.lewy.circleachieve.api.CountryApi;
import cn.xzxy.lewy.circleachieve.dto.country.CountryDetailReq;
import cn.xzxy.lewy.circleachieve.vs.CountryVs;
import cn.xzxy.lewy.framework.core.model.JsonResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author lewy95
 */
@Api(value = "国家管理接口")
@Slf4j
@RestController
@RequestMapping("/consumer/rest/country")
public class CountryController {

    @Resource
    private CountryVs countryVs;

    @PostMapping("detail")
    @ApiOperation(value = "查询国家详情", notes = "查询国家详情")
    public JsonResponseEntity hospitalList(@RequestBody @Valid CountryDetailReq countryDetailReq) {
        return countryVs.getCountry(countryDetailReq);
    }
}
