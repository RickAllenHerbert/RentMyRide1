package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Car;
import za.ac.cput.entity.Employee;
import za.ac.cput.factory.CarFactory;
import za.ac.cput.service.CarService;

import java.util.Set;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/create")
    public Car create(@RequestBody Car car) {
        return carService.create(car);
    }
    @GetMapping("/read/{numberPlate}")
    public Car read(@PathVariable String numberPlate) {
        return carService.read(numberPlate);
    }

    @RequestMapping("/update")
    public Car update(@RequestBody Car car) {
        Car updateCar = carService.update(car);
        return updateCar;
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id)
    {
        return carService.delete(id);
    }


    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public ResponseEntity<Set<Car>> getAll(){
        Set<Car> cars = carService.getAll();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

}
