//package za.ac.cput.controller;
//
///*
//    @Description:ClientController ->
//    @Author: Cole Hanekom
//    @Student Number: 217267556
//    @Date: 24 August 2021
//*/
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import za.ac.cput.entity.Client;
//import za.ac.cput.factory.ClientFactory;
//import za.ac.cput.service.ClientService;
//
//import java.util.Set;
//
//@RestController
//@
//        Controller
//@RequestMapping("/client")
//public class ClientController {
//    @Autowired
//    private ClientService clientService;
//
//    @PostMapping("/create")
//    public Client create(@RequestBody Client client){
//        Client newClient = ClientFactory.createClient(client.getName(),client.getSurname(), client.getContactNumber(), client.getAccountNumber());
//        return clientService.create(newClient);
//    }
//
//    @GetMapping("/read/{clientid}")
//    public Client read(@PathVariable String clientid){
//        return clientService.read(clientid);
//    }
////public Client read(@RequestBody Client client){
////        return clientService.read(client.getClientID());
////}
//
//    @PostMapping("/update")
//    public Client update(@RequestBody Client client){
//        return clientService.update(client);
//    }
//
////    @PostMapping("/delete")
////    public String delete(@RequestBody Client client){
////        if(clientService.delete(client.getClientID()))
////            return "Successfully deleted";
////        else
////            return "Could not delete";
////    }
//
//    @DeleteMapping("/delete/{clientid}")
//    public boolean delete(@PathVariable String clientid){
//        return clientService.delete(clientid);
//    }
//
//    @GetMapping("/getall")
//    public Set<Client> getAll(){
//        return clientService.getAll();
//    }
//
//    @GetMapping("/getallwitha")
//    public Set<Client> getallwitha(){
//        return clientService.getAllClientsStartWithA();
//    }
//
////    @GetMapping("/getallwithgivenname")
////    public Set<Client> getallwithgivenname(){
////        return clientService.getAllClientsGivenName();
////    }
//}
//
