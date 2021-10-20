/*
    @title: CarService ->
    @Author: Rick Allen Herbert
    @Student Number: 219014337
    @Date: 1 August 2021
*/
package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.Car;
import za.ac.cput.factory.CarFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CarServiceTest {
    @Autowired
    private static CarService service;

    private static Car car = CarFactory.createCar(
            "412556",
            "Blue",
            "Ford",
            "Mustang",
            9500.00,
            "Storage Unit 6",
            true);

    @Test
    void a_create() {
        Car createCar = service.create(car);
        assertEquals(createCar.getNumberPlate(), car.getNumberPlate());
        System.out.println("Created: " + createCar);
        System.out.println(" ");
    }

    @Test
    void b_read() {
        Car readCar = service.read(car.getNumberPlate());
        assertNotNull(readCar);
        System.out.println("Read: " + readCar);
        System.out.println(" ");
    }

    @Test
    void c_update() {
        Car updateCar = new Car.Builder().copy(car).color("Red").build();
        assertNotNull(service.update(updateCar));
        System.out.println("Updated: " + updateCar);
        System.out.println(" ");
    }

    @Test
    void d_getAllCar() {
        System.out.println("Display All Cars: ");
        System.out.println(service.getAll());
        System.out.println(" ");
    }

    @Test
    void e_delete() {
        boolean success = service.delete(car.getNumberPlate());
        assertTrue(success);
        System.out.println("Delete:" + success);
    }



}