package cn.xzxy.lewy.circleachieve.dto.country;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * demo >>> test kafka listener handler refer to template design pattern
 *
 * @author lewy95
 */
@Data
public class CountryKafkaDto {

    @NotBlank(message = "country name cannot be null")
    private String country;
    @NotNull(message = "countryId cannot be null")
    private Integer countryId;
}
