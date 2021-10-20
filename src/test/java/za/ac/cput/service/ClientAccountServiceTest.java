//package za.ac.cput.service;
///*
//    @Description: Client Account Service Test ->
//    @Author: Asiphiwe Hanjiwe
//    @Student Number: 218336675
//    @Date: 30 July 2021
// */
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.entity.ClientAccount;
//import za.ac.cput.factory.ClientAccountFactory;
//import static org.junit.jupiter.api.Assertions.*;
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class ClientAccountServiceTest {
//    private static ClientAccountService service  = ClientAccountService.getService();
//    private static ClientAccount account = ClientAccountFactory.createClientAccount("35","51237");
//
//    @Test
//    @Order(1)
//    void create() {
//       ClientAccount create = service.create(account);
//        assertEquals(create.getAccountNum(),account.getAccountNum());
//        System.out.println("Created: " + create);
//        System.out.println(" ");
//    }
//
//    @Test
//    @Order(2)
//    void read() {
//        ClientAccount read = service.read(account.getAccountNum());
//        assertNotNull(read);
//        System.out.println("Read: " + read);
//        System.out.println(" ");
//    }
//
//    @Test
//    @Order(3)
//    void update() {
//        ClientAccount update = new ClientAccount.Builder().copy(account).setNumBorrowed("45").build();
//        assertNotNull(service.update(update));
//        System.out.println("Updated: " + update);
//        System.out.println(" ");
//    }
//
//    @Test
//    @Order(5)
//    void delete() {
//        boolean success = service.delete(account.getAccountNum());
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
//    }
