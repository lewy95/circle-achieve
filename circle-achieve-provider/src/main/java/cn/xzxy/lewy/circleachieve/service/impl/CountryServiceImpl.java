package cn.xzxy.lewy.circleachieve.service.impl;

import cn.xzxy.lewy.circleachieve.mapper.CountryMapper;
import cn.xzxy.lewy.circleachieve.pojo.Country;
import cn.xzxy.lewy.circleachieve.service.CountryService;
import cn.xzxy.lewy.mvc.exception.BusinessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

    @Resource
    CountryMapper countryMapper;

    @Override
    public Country getCountry(int id) {

        Country country = countryMapper.selectByPrimaryKey(id);
        if (country == null) {
            throw new BusinessException(10086, "无法查询到信息");
        }

        return country;
    }
}
