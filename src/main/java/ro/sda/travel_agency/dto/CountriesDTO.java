package ro.sda.travel_agency.dto;

import lombok.Data;

@Data
public class CountriesDTO {

    private Integer countryId;
    private String countryName;
    private ContinentsDTO continent;
}
