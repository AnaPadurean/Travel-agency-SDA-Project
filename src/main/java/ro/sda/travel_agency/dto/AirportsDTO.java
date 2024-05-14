package ro.sda.travel_agency.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirportsDTO {

    private Integer airportId;
    private String airportName;
    private CitiesDTO city;

}
