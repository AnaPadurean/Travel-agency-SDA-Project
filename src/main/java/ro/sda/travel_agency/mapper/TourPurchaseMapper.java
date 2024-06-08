package ro.sda.travel_agency.mapper;

import ro.sda.travel_agency.dto.TourPurchaseDTO;
import ro.sda.travel_agency.entity.TourPurchased;

public class TourPurchaseMapper {

    public static TourPurchaseDTO entityToDTO(TourPurchased tourPurchase) {
        if (tourPurchase == null)
            return null;
        TourPurchaseDTO tourPurchaseDTO = new TourPurchaseDTO();
        tourPurchaseDTO.setTourPurchaseId(tourPurchase.getTour_purchase_id());
        tourPurchaseDTO.setTour(ToursMapper.entityToDTO(tourPurchase.getTour()));
        tourPurchaseDTO.setNumberOfPersons(tourPurchase.getNumber_of_persons());
        tourPurchaseDTO.setTotalPrice(tourPurchase.getTotal_price());
        return tourPurchaseDTO;
    }

    public static TourPurchased dtoToEntity(TourPurchaseDTO tourPurchaseDTO) {
        if (tourPurchaseDTO == null)
            return null;
        TourPurchased tourPurchase = new TourPurchased();
        tourPurchase.setTour_purchase_id(tourPurchaseDTO.getTourPurchaseId());
        tourPurchase.setTour(ToursMapper.dtoToEntity(tourPurchaseDTO.getTour()));
        tourPurchase.setNumber_of_persons(tourPurchaseDTO.getNumberOfPersons());
        tourPurchase.setTotal_price(tourPurchaseDTO.getTotalPrice());
        return tourPurchase;

    }
}
