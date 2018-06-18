package com.utn.tp5.frontEnd.model;

import com.utn.tp5.DTO.CabinDTO;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class CabinFormated {
    private String name;

    public CabinFormated(CabinDTO cabin)
    {
        this.name = cabin.getName();
    }
}
