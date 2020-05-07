package cn.xzxy.lewy.circleachieve.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author lewy95
 */
@Data
public class CountryDetailReq {

    @NotNull(message = "countryId不能为空")
    Integer countryId;
}
