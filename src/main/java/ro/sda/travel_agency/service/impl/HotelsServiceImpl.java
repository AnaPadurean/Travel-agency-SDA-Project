package ro.sda.travel_agency.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sda.travel_agency.entity.Hotels;
import ro.sda.travel_agency.repository.HotelsRepository;
import ro.sda.travel_agency.service.HotelsService;

import java.util.List;
import java.util.Optional;

@Service
public class HotelsServiceImpl implements HotelsService {
    @Autowired
    HotelsRepository hotelsRepository;

    @Override
    public Optional<Hotels> findHotelById(Integer id) {
        return hotelsRepository.findById(id);
    }

    @Override
    public List<Hotels> findAllHotels() {
        return hotelsRepository.findAll();
    }
}