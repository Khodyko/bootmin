package java.holic.bootmin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.holic.bootmin.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
}
