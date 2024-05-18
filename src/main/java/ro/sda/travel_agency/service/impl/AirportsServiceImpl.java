package ro.sda.travel_agency.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sda.travel_agency.dto.AirportsDTO;
import ro.sda.travel_agency.entity.Airports;
import ro.sda.travel_agency.mapper.AirportsMapper;
import ro.sda.travel_agency.repository.AirportsRepository;
import ro.sda.travel_agency.service.AirportsService;

import java.util.List;
import java.util.Optional;

@Service
public class AirportsServiceImpl implements AirportsService {

    @Autowired
    private AirportsRepository airportsRepository;


    @Override
    public AirportsDTO findAirportById(Integer id) {
        Optional<Airports> ap = airportsRepository.findById(id);
        Airports airports = null;
        if (ap.isPresent()) {
            airports = ap.get();
        }
        return AirportsMapper.entityToDTO(airports);
    }

    @Override
    public List<Airports> findAllAirports() {
      return airportsRepository.findAll();
    }


}
