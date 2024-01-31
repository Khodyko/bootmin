package jaava.holic.bootmin.service.impl;

import org.springframework.stereotype.Service;

import jaava.holic.bootmin.model.Car;
import jaava.holic.bootmin.repository.CarRepository;
import jaava.holic.bootmin.service.CarService;
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
