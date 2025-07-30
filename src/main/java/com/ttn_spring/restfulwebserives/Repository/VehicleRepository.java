package com.ttn_spring.restfulwebserives.Repository;

import com.ttn_spring.restfulwebserives.Entity.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}