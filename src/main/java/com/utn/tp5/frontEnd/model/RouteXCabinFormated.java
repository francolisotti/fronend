package com.utn.tp5.frontEnd.model;

import com.utn.tp5.DTO.RouteXCabinDTO;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class RouteXCabinFormated {

    private CabinFormated cabin;
    private RouteFormated route;
    private PriceFormated price;

    public RouteXCabinFormated(RouteXCabinDTO routeXCabin) {
        this.cabin = new CabinFormated(routeXCabin.getCabin());
        this.route = new RouteFormated(routeXCabin.getRoute());
        this.price = new PriceFormated(routeXCabin.getPrice());
    }
}
