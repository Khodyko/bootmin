package jaava.holic.bootmin.controller;

import jaava.holic.bootmin.model.Car;
import jaava.holic.bootmin.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "car")
public class CarController {

    CarRepository repository;

    @Autowired
    public CarController(CarRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public List<Car> getCars() {
        return (List<Car>) repository.findAll();
    }

}
