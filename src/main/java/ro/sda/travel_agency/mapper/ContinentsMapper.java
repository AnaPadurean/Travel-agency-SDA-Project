package ro.sda.travel_agency.mapper;

import ro.sda.travel_agency.dto.ContinentsDTO;
import ro.sda.travel_agency.entity.Continents;

public class ContinentsMapper {

    public static ContinentsDTO entityToDTO(Continents continents) {
        if (continents == null)
            return null;
            ContinentsDTO continentsDTO = new ContinentsDTO();
            continentsDTO.setContinentId(continents.getContinent_id());
            continentsDTO.setContinentName(continents.getContinent_name());
            return continentsDTO;
        }

    public static Continents dtoToEntity (ContinentsDTO continentsDTO){
        if (continentsDTO == null)
            return null;
            Continents continents = new Continents();
            continents.setContinent_id(continentsDTO.getContinentId());
            continents.setContinent_name(continentsDTO.getContinentName());
            return continents;

        }
}
