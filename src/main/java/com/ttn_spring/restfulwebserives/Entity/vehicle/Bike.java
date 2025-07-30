package com.ttn_spring.restfulwebserives.Entity.vehicle;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BIKE")
public class Bike extends Vehicle {
    private String handleType;
}