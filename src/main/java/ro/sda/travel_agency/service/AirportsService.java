package ro.sda.travel_agency.service;


import ro.sda.travel_agency.dto.AirportsDTO;
import ro.sda.travel_agency.entity.Airports;

import java.util.List;

public interface AirportsService {


    AirportsDTO findAirportById(Integer id);

    List<Airports> findAllAirports();
}
