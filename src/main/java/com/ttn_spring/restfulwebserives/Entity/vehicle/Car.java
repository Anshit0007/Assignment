package com.ttn_spring.restfulwebserives.Entity.vehicle;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CAR")
public class Car extends Vehicle {
    private int doors;
}