package com.utn.tp5.frontEnd.controllers;

import com.utn.tp5.DTO.AirportDTO;
import com.utn.tp5.DTO.RouteDTO;
import com.utn.tp5.DTO.RouteXCabinDTO;
import com.utn.tp5.frontEnd.model.AirportFormated;
import com.utn.tp5.frontEnd.model.RouteFormated;
import com.utn.tp5.frontEnd.model.RouteXCabinFormated;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static com.utn.tp5.frontEnd.FrontEndApplication.urlApiRest;

@RestController
@RequestMapping(value = "/")
public class DefaultController {
    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping(value = "", produces = "application/json")
    public List<AirportFormated> listAirports() {
        ResponseEntity<AirportDTO[]> airports = restTemplate.getForEntity(urlApiRest + "airport/", AirportDTO[].class);
        List<AirportFormated> airportsFormated = new ArrayList<>();
        for (AirportDTO airport: airports.getBody()) {
            airportsFormated.add(new AirportFormated(airport));
        }
        return airportsFormated;
    }

    @GetMapping(value = "{iata}", produces =  "application/json")
    public List listAirportRoutes(@PathVariable("iata")String iata) {
        ResponseEntity<RouteDTO[]> routes = restTemplate.getForEntity(urlApiRest + "route/"+ iata, RouteDTO[].class);
        List<RouteFormated> routesFormated = new ArrayList<>();
        for (RouteDTO route: routes.getBody()) {
            routesFormated.add(new RouteFormated(route));
        }
        return routesFormated;
    }

    @GetMapping(value = "{origin}/{destination}", produces =  "application/json")
    public List listRoutesXCabinByOriginAndDestination(@PathVariable("origin")String origin, @PathVariable("destination")String destination) {
        ResponseEntity<RouteXCabinDTO[]> routesXCabins = restTemplate.getForEntity(urlApiRest + "routeXCabin/"+ origin + "/" + destination, RouteXCabinDTO[].class);
        List<RouteXCabinFormated> routesXCabinsFormated= new ArrayList<>();
        for (RouteXCabinDTO routeXCabin: routesXCabins.getBody()) {
            routesXCabinsFormated.add(new RouteXCabinFormated(routeXCabin));
        }
        return routesXCabinsFormated;
    }
}