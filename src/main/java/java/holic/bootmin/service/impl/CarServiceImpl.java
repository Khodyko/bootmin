package java.holic.bootmin.service.impl;

import org.springframework.stereotype.Service;

import java.holic.bootmin.model.Car;
import java.holic.bootmin.repository.CarRepository;
import java.holic.bootmin.service.CarService;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return (List<Car>) carRepository.findAll();
    }
}
