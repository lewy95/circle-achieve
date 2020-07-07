package cn.xzxy.lewy.circleachieve.vs;

import cn.xzxy.lewy.circleachieve.dto.country.CountryDetailReq;
import cn.xzxy.lewy.framework.core.model.JsonResponseEntity;

/**
 * @author lewy95
 */
public interface CountryVs {

    JsonResponseEntity getCountry(CountryDetailReq countryDetailReq);
}
