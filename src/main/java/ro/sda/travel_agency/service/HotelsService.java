package ro.sda.travel_agency.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import ro.sda.travel_agency.entity.Countries;
import ro.sda.travel_agency.entity.Hotels;

import java.util.List;
import java.util.Optional;

public interface HotelsService {
    Optional<Hotels> findHotelById(Integer id);

    List<Hotels> findAllHotels();
}
