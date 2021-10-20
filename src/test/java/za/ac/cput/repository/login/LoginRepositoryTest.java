//package za.ac.cput.repository.login;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.entity.Login;
//import za.ac.cput.factory.LoginFactory;
//import static org.junit.jupiter.api.Assertions.*;
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//
//class LoginRepositoryTest {
//    private static  LoginRepository repository = LoginRepository.getRepository();
//    private static Login login = LoginFactory.createLogin("","","");
//
//
//    @Test
//    @Order(1)
//    void create() {
//        Login create = repository.create(login);
//        assertEquals(create.getUsername(),login.getUsername());
//        System.out.println("Created: " + create);
//        System.out.println(" ");
//    }
//
//    @Test
//    @Order(2)
//    void read() {
//        Login read = repository.read(login.getUsername());
//        assertNotNull(read);
//        System.out.println("Read: " + read);
//        System.out.println(" ");
//    }
//
//    @Test
//    @Order(3)
//    void update() {
//        Login updated = new Login.Builder().copy(login).setUsername("").setPassword("").build();
//        assertNotNull(repository.update(updated));
//        System.out.println("Updated: " + updated);
//        System.out.println(" ");
//    }
//
//    @Test
//    @Order(4)
//    void getAll() {
//        System.out.println("Display All: ");
//        System.out.println(repository.getAll());
//        System.out.println(" ");
//    }
//    @Test
//    @Order(5)
//    void delete() {
//        boolean success = repository.delete(login.getUsername());
//        assertTrue(success);
//        System.out.println("Deleted: " + success);
//        System.out.println(" ");
//    }
//}