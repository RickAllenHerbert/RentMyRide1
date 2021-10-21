package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.Employee;
import za.ac.cput.factory.EmployeeFactory;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class EmployeeServiceTest {
    @Autowired
    private static EmployeeService service;
    private static Employee employee = EmployeeFactory.createEmployee("Ty","Lloyd", "Admin","CoffeeAndKicks","141202141");

    @Test
    @Order(1)
    void create(){
        Employee create = service.create(employee);
        assertEquals(create.getEmployeeNumber(), employee.getEmployeeNumber());
        System.out.println("Created: " + create);
        System.out.println(" ");
    }

    @Test
    @Order(2)
    void read(){
        Employee read = service.read(employee.getEmployeeNumber());
        assertNotNull(read);
        System.out.println("Read: " + read);
        System.out.println(" ");
    }

    @Test
    @Order(3)
    void update(){
        Employee update = new Employee.Builder().copy(employee).setUsername("KicksAndCoffee").setPassword("215141210").build();
        assertNotNull(service.update(update));
        System.out.println("Updated: " + update);
        System.out.println(" ");
    }
    @Test
    @Order(5)
    void delete(){
        boolean success = service.delete(employee.getEmployeeNumber());
        assertTrue(success);
        System.out.println("Deleted: " + success);
        System.out.println(" ");

    }
    @Test
    @Order(4)
    void getAll(){
        System.out.println("Display All: ");
        System.out.println(service.getAll());
        System.out.println(" ");
    }

}