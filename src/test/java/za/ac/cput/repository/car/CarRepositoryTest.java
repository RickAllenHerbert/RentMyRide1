/* CarRepositoryTest.java
   Test for implementation of Car Repository
   Author: Rick Allen Herbert (219014337)
   Date: 24 July 2021
*/
package za.ac.cput.repository.car;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.Car;
import za.ac.cput.factory.CarFactory;

import javax.persistence.EntityNotFoundException;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class CarRepositoryTest {

    @Autowired
    private static ICarRepository repository;
    private static Car car = CarFactory.createCar(
            "412556",
            "Blue",
            "Ford",
            "Mustang",
            9500.00,
            "Storage Unit 6",
            true);

    @Test
    void a_createCar() {
        Car created = repository.save(car);
        assertEquals(created.getNumberPlate(), car.getNumberPlate());
        System.out.println("Create: " + created);
    }

    @Test
    void b_readCar() {
        Car read = repository.findById(car.getNumberPlate()).orElseThrow(() -> new EntityNotFoundException("Car with id " + car.getNumberPlate() + " was not found" ));
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_updateCar()
    {
        Car updated = new Car.Builder().copy(car).color("Red").build();
        assertNotNull(repository.save(updated));
        System.out.println("Update:" + updated);
    }

    @Test
    boolean d_deleteCar()
    {
        Car read = repository.findById(car.getNumberPlate()).orElseThrow(() -> new EntityNotFoundException("Car with id " + car.getNumberPlate() + " was not found" ));
        this.repository.deleteById(read.getNumberPlate());
        if(this.repository.existsById(read.getNumberPlate()))
            return false;
        else
            return true;
    }

    @Test
    void e_getAllCar(){
        System.out.println("Show All:");
        System.out.println(repository.findAll().stream().collect(Collectors.toSet()));
    }
}