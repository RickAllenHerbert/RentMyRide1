/*
    @title: CarService ->
    @Author: Rick Allen Herbert
    @Student Number: 219014337
    @Date: 1 August 2021
*/
package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Car;
import za.ac.cput.repository.car.ICarRepository;
import za.ac.cput.service.car.ICarService;

import javax.persistence.EntityNotFoundException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CarService implements ICarService {
    private ICarRepository repository;

    @Autowired
    private CarService(ICarRepository repository) {
        this.repository = repository;
    }

    @Override
    public Car create(Car car) {
        return this.repository.save(car);
    }

    @Override
    public Car read(String numberPlate) {
        return this.repository.findById(numberPlate).orElseThrow(() -> new EntityNotFoundException("Car with id " + numberPlate + " was not found" ));
    }

    @Override
    public Car update(Car car) {
        if(this.repository.existsById(car.getNumberPlate()))
            return this.repository.save(car);
        return null;
    }

    @Override
    public boolean delete(String numberPlate) {
        this.repository.deleteById(numberPlate);
        if(this.repository.existsById(numberPlate))
            return false;
        else
            return true;
    }

    @Override
    public Set<Car> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
