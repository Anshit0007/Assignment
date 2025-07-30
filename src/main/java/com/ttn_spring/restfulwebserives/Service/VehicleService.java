package com.ttn_spring.restfulwebserives.Service;

import com.ttn_spring.restfulwebserives.Entity.vehicle.Vehicle;
import com.ttn_spring.restfulwebserives.Repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepository repo;
    public VehicleService(VehicleRepository repo) {
        this.repo = repo;
    }

    public Vehicle save(Vehicle v) {
        return repo.save(v);
    }

    public List<Vehicle> getAll() {
        return repo.findAll();
    }
}