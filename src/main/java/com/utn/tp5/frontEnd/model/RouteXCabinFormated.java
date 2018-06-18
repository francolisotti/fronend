package com.utn.tp5.frontEnd.model;

import com.utn.tp5.DTO.PriceDTO;
import com.utn.tp5.DTO.RouteXCabinDTO;
import com.utn.tp5.model.Price;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class RouteXCabinFormated {

    private CabinFormated cabin;
    private RouteFormated route;
    private List<PriceFormated> prices;

    public RouteXCabinFormated(RouteXCabinDTO routeXCabin) {
        this.cabin = new CabinFormated(routeXCabin.getCabin());
        this.route = new RouteFormated(routeXCabin.getRoute());
        this.prices = new ArrayList<>();
        for (PriceDTO price: routeXCabin.getPrices()){
            this.prices.add(new PriceFormated(price));
        }
    }
}
