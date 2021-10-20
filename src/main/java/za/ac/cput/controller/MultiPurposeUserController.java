package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.MultiPurposeUser;
import za.ac.cput.service.MultiPurposeUserService;

import java.util.Set;

@RestController
@RequestMapping("/multilogin")
public class MultiPurposeUserController {

    @Autowired
    private MultiPurposeUserService service;

    @RequestMapping("/login/{username}/{password}")
    public MultiPurposeUser login(@PathVariable String username, @PathVariable String password){
        return service.Login(username, password);
    }

    @RequestMapping("/getall")
    public Set<MultiPurposeUser> getAll() {
        return service.getAll();
    }
}
