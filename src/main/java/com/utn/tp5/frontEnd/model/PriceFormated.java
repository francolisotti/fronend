package com.utn.tp5.frontEnd.model;

import com.utn.tp5.DTO.PriceDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Setter
@Getter
public class PriceFormated {
    private int price;
    private Date dateFrom;

    public PriceFormated(PriceDTO price) {
        this.price = price.getPrice();
        this.dateFrom = price.getDateFrom();
    }
}
