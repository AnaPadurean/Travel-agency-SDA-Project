package ro.sda.travel_agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.sda.travel_agency.entity.Tours;

public interface ToursRepository extends JpaRepository<Tours, Integer> {
}
