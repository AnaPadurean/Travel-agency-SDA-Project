package ro.sda.travel_agency.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sda.travel_agency.entity.Airports;
import ro.sda.travel_agency.repository.AirportsRepository;
import ro.sda.travel_agency.service.AirportsService;

@Service
public class AirportsServiceImpl implements AirportsService {

    @Autowired
    private AirportsRepository airportsRepository;

    @Override
    public Long airportNumber(){
        return airportsRepository.findAll().stream().count();
    }

    @Override
    public Airports findAirportById(Integer id) {
        return airportsRepository.findById(id).get();
    }


}
