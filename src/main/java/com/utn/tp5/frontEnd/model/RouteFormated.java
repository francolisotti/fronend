package com.utn.tp5.frontEnd.model;

import com.utn.tp5.DTO.RouteDTO;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class RouteFormated {

    private AirportFormated origin;
    private AirportFormated destination;
    private float distance;

    public RouteFormated(RouteDTO route) {
        this.origin = new AirportFormated(route.getOrigin());
        this.destination = new AirportFormated(route.getDestination());
        this.distance = route.getDistance();
    }
}
