package java.holic.bootmin.service;

import org.springframework.stereotype.Service;

import java.holic.bootmin.model.Car;
import java.util.List;


public interface CarService {

    List<Car> getAllCars();
}
