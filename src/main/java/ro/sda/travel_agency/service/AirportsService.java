package ro.sda.travel_agency.service;


import ro.sda.travel_agency.dto.AirportsDTO;
import ro.sda.travel_agency.entity.Airports;

import java.util.List;
import java.util.Optional;

public interface AirportsService {

    AirportsDTO findAirportsDTOById(Integer id);

    List<Airports> findAllAirports();

    void createAirport(AirportsDTO airportsDTO);
}
