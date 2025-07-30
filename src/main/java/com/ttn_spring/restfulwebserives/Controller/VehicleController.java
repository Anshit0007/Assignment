package com.ttn_spring.restfulwebserives.Controller;

import com.ttn_spring.restfulwebserives.Entity.vehicle.Bike;
import com.ttn_spring.restfulwebserives.Entity.vehicle.Car;
import com.ttn_spring.restfulwebserives.Entity.vehicle.Vehicle;
import com.ttn_spring.restfulwebserives.Service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    private final VehicleService service;
    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @PostMapping("/car")
    public Vehicle saveCar(@RequestBody Car car) {
        return service.save(car);
    }

    @PostMapping("/bike")
    public Vehicle saveBike(@RequestBody Bike bike) {
        return service.save(bike);
    }

    @GetMapping
    public List<Vehicle> getAll() {
        return service.getAll();
    }
}