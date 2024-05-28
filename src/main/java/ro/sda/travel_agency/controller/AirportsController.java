package ro.sda.travel_agency.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.sda.travel_agency.dto.AirportsDTO;
import ro.sda.travel_agency.entity.Airports;
import ro.sda.travel_agency.service.AirportsService;
import java.util.List;


@CrossOrigin (origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class AirportsController {

    @Autowired
    private AirportsService airportsService;

    @Operation(summary = "GET all airports")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the requested entities",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Airports.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Entity not found",
                    content = @Content) })
    @GetMapping(value="/airports", produces = "application/json")
    public List<Airports> getAllAirports() {
        return airportsService.findAllAirports();
    }

    @Operation(summary = "GET an airport by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the requested entities",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = AirportsDTO.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Entity not found",
                    content = @Content) })
    @GetMapping(value = "/airports/{id}", produces = "application/json")
    public AirportsDTO getAirportsById(@PathVariable Integer id) {
        return airportsService.findAirportsDTOById(id);
    }

    @Operation(summary = "Create a new Airport")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Connection up, operation successful",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = AirportsDTO.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid data supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Entity not found",
                    content = @Content)})
    @PostMapping("/new_airport")
    public AirportsDTO createNewDTOAirport(@RequestBody AirportsDTO airportsDTO) {
        airportsService.createAirport(airportsDTO);
        return airportsDTO;
    }

//    @Operation(summary = "Edit Airports by id")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Connection up, operation successful",
//                    content = {@Content(mediaType = "application/json",
//                            schema = @Schema(implementation = AirportsDTO.class))}),
//            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
//                    content = @Content),
//            @ApiResponse(responseCode = "404", description = "Entity not found",
//                    content = @Content)})
//    @RequestMapping(value = "/update_airports/{id}", method = {RequestMethod.PUT})
//    public MissionTask updateMissionTask(@PathVariable("missionTaskId") Integer id, @RequestBody MissionTaskDTO missionTaskDTO) {
//        MissionTask d = missionTaskService.updateTask(id, missionTaskDTO);
//        return d;
//  }

}
