package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;

import za.ac.cput.entity.ClientAccount;
import za.ac.cput.factory.ClientAccountFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Controller
@SpringBootConfiguration

class ClientAccountControllerTest {
private static ClientAccount clientAccount = ClientAccountFactory.createClientAccount("12",
        "534621");
    public static String SERCURITY_USERNAME = "user";
    public static String SERCURITY_PASSWORD = "b591c7a8-3b36-4706-acc0-0f655c721013";
@Autowired
private TestRestTemplate restTemplate;
private final String baseURL = "http://localhost:8080/client/create";

    @Test
    @Order(1)
    void create()
    {
        String url = baseURL +"/create";
        ResponseEntity<ClientAccount> postResponse = restTemplate.postForEntity
                (url,clientAccount,ClientAccount.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        //assertEquals(postResponse.getStatusCode(), HttpStatus.OK);
        clientAccount = postResponse.getBody();
        System.out.println("Save data:" + clientAccount);
        assertEquals(clientAccount.getAccountNum(),postResponse.getBody().getAccountNum());

    }

    @Test
    @Order(2)
    void read() {
        String url = baseURL+"/read/" + clientAccount.getAccountNum();
        System.out.println("URL read" + url);
        ResponseEntity<ClientAccount> responseEntity = restTemplate.getForEntity(url,ClientAccount.class);
        //assertEquals(clientAccount.getAccountNum(),responseEntity.getBody().getAccountNum());

    }

    @Test
    @Order(3)
    void update() {
//        ClientAccount update = new ClientAccount.Builder().copy(clientAccount).
//                setNumBorrowed("90").build();
//        String url = baseURL+"/update";
//        System.out.println("URL read" + url);
//        System.out.println("Updated data" + update);
//        ResponseEntity<ClientAccount> response = restTemplate.postForEntity(url,update,ClientAccount.class);
//        assertNotNull(response.getBody());


    }

    @Test
    @Order(4)
    void delete()
    {
        String url = baseURL+"/delete/" + clientAccount.getAccountNum();
        System.out.println("URL deleted: " + url);
        restTemplate.delete(url);
    }

    @Test
    void getAll()
    {
        String url = baseURL+"/getAll/";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<String> responseEntity = restTemplate
                .withBasicAuth(SERCURITY_USERNAME,SERCURITY_PASSWORD)
                .exchange(url, HttpMethod.GET,entity,String.class);
        System.out.println("Show All the data stored");
        System.out.println(responseEntity);
        System.out.println(responseEntity.getBody());



    }
}