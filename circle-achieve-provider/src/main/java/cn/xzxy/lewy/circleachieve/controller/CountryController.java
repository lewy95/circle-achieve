package cn.xzxy.lewy.circleachieve.controller;

import cn.xzxy.lewy.circleachieve.aspect.OpLog;
import cn.xzxy.lewy.circleachieve.dto.CountryDetailReq;
import cn.xzxy.lewy.circleachieve.service.CountryService;
import cn.xzxy.lewy.core.model.JsonResponseEntity;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Api("国家管理接口")
@RestController
@RequestMapping("/rest/country")
public class CountryController {

    @Resource
    private CountryService countryService;

    @PostMapping("detail")
    @OpLog(methodCode = "getCountry", methodName = "获取国家信息")
    public JsonResponseEntity getCountry(@RequestBody @Valid CountryDetailReq countryDetailReq) {

        return JsonResponseEntity.buildOK(countryService.getCountry(countryDetailReq.getCountryId()));

    }
}

