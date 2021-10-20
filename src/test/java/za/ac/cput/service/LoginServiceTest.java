//package za.ac.cput.service;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.entity.Login;
//import za.ac.cput.factory.LoginFactory;
//import static org.junit.jupiter.api.Assertions.*;
///*
//    @Description: Login  Service Test ->
//    @Author: Asiphiwe Hanjiwe
//    @Student Number: 218336675
//    @Date: 30 July 2021
// */
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//
//class LoginServiceTest {
//    private static LoginService service = LoginService.getService();
//    private static Login loginaccount = LoginFactory.createLogin("employee", "Han29087", "emp@29087");
//
//    @Test
//    @Order(1)
//    void create() {
//        Login create = service.create(loginaccount);
//        assertEquals(create.getUsername(), loginaccount.getUsername());
//        System.out.println("Created: " + create);
//        System.out.println(" ");
//    }
//
//    @Test
//    @Order(2)
//    void read() {
//        Login read = service.read(loginaccount.getUsername());
//        assertNotNull(read);
//        System.out.println("Read: " + read);
//        System.out.println(" ");
//    }
//
//    @Test
//    @Order(3)
//    void update() {
//      Login update = new Login.Builder().copy(loginaccount).setUserType("Admin").build();
//        assertNotNull(service.update(update));
//        System.out.println("Updated: " + update);
//        System.out.println(" ");
//    }
//
//    @Test
//    @Order(5)
//    void delete() {
//        boolean success = service.delete(loginaccount.getUsername());
//        assertTrue(success);
//        System.out.println("Deleted: " + success);
//        System.out.println(" ");
//    }
//
//    @Test
//    @Order(4)
//    void getAll() {
//        System.out.println("Display All: ");
//        System.out.println(service.getAll());
//        System.out.println(" ");
//
//    }
//}