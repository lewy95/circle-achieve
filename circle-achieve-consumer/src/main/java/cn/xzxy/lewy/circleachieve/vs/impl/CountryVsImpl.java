package cn.xzxy.lewy.circleachieve.vs.impl;

import cn.xzxy.lewy.circleachieve.api.CountryApi;
import cn.xzxy.lewy.circleachieve.dto.country.CountryDetailReq;
import cn.xzxy.lewy.circleachieve.vs.CountryVs;
import cn.xzxy.lewy.framework.core.model.JsonResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lewy95
 */
@Service
public class CountryVsImpl implements CountryVs {

    @Resource
    CountryApi countryApi;

    @Override
    public JsonResponseEntity getCountry(CountryDetailReq countryDetailReq) {
        return countryApi.getCountry(countryDetailReq);
    }
}
