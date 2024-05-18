package ro.sda.travel_agency.service;


import ro.sda.travel_agency.entity.Airports;

public interface AirportsService {

    Long airportNumber();

    Airports findAirportById(Integer id);
}
