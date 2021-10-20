package za.ac.cput.service;
/*
   @Description:CarLotServiceTest.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 02 August 2021
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.CarLot;
import za.ac.cput.factory.CarLotFactory;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class CarLotServiceTest {
    private static CarLotService service  = CarLotService.getService();
    private static CarLot carLot = CarLotFactory.createCarLot("215586","HG45");

    @Test
    @Order(1)
    void create(){
        CarLot create = service.create(carLot);
        assertEquals(create.getNumberPlate(), carLot.getNumberPlate());
        System.out.println("Created: " + create);
    }

    @Test
    @Order(2)
    void read(){
        CarLot read = service.read(carLot.getNumberPlate());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }


    @Test
    @Order(3)
    void update() {
        CarLot updated = new CarLot.Builder().copy(carLot).setParkingSpace("54HH").build();
        assertNotNull(service.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    @Order(4)
    void getAll(){
        System.out.println("Display All: ");
        System.out.println(service.getAll());
    }

    @Test
    @Order(5)
    void delete(){
        boolean success = service.delete(carLot.getNumberPlate());
        assertTrue(success);
        System.out.println("Deleted: " + success);

    }

}