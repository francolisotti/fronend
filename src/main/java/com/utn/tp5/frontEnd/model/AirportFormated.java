package com.utn.tp5.frontEnd.model;

import com.utn.tp5.DTO.AirportDTO;
import lombok.Setter;
import lombok.Getter;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class AirportFormated {

    private String name;
    private String iataCode;

    public AirportFormated(AirportDTO airportDTO){
        this.name = airportDTO.getCity().getName() + "(" + airportDTO.getCity().getIata() + ")" + " - " + airportDTO.getName() + " - " + airportDTO.getCity().getCountry().getName();
        this.iataCode = airportDTO.getIata();
    }
}
