package cn.xzxy.lewy.circleachieve.controller;

import cn.xzxy.lewy.circleachieve.aspect.OpLog;
import cn.xzxy.lewy.circleachieve.dto.CountryDetailReq;
import cn.xzxy.lewy.circleachieve.service.CountryService;
import cn.xzxy.lewy.core.model.JsonResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/rest/country")
public class CountryController {

    @Resource
    private CountryService countryService;

    // 写法一
    //@RequestMapping("detail/{id}")
    //public String getCountry(@PathVariable int id) {
    //    return countryService.getCountry(id).toString();
    //}

    // 写法二
    @PostMapping("detail")
    @OpLog(methodCode = "getCountry", methodName = "获取国家信息")
    public JsonResponseEntity getCountry(@RequestBody @Valid CountryDetailReq countryDetailReq) {

        return JsonResponseEntity.buildOK(countryService.getCountry(countryDetailReq.getCountryId()));

    }
}

/**
 * circle-achieve是一个用于业务实现的子工程，它继承circle-parent父工程，依赖父工程中自定义的starters
 * circle-achieve本身也是一个父工程，它下面可以有多个模块，每个模块中编写的代码不同，一般来说至少有
 * 三个模块（对于springCloud的项目来说）:
 * circle-achieve-api：存放一些供工程中其他模块调用的公共api或者dto
 * circle-achieve-consumer：消费者，用于处理其他工程的调用请求，通过调用api将请求转到生产这
 * circle-achieve-provider：生产者，用于业务实现的核心模块
 */

