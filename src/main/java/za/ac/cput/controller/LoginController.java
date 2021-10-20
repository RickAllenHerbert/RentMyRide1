package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.ClientAccount;
import za.ac.cput.entity.Login;
import za.ac.cput.factory.ClientAccountFactory;
import za.ac.cput.factory.LoginFactory;
import za.ac.cput.service.ClientAccountService;
import za.ac.cput.service.LoginService;

import java.util.Set;
@RestController
@Controller
@RequestMapping("/client")
public class LoginController {


        @Autowired
        private LoginService service;

        @PostMapping("/create")
        @ResponseStatus(HttpStatus.CREATED)
        public Login create(@RequestBody Login log)
        {
            Login newLogin = LoginFactory.createLogin(log.getUserType(),log.getUsername(),log.getPassword());
            return service.create(log);
        }
        @GetMapping("/read")
        public Login read (@RequestBody Login loginPassword)
        {
            return service.read(loginPassword.getPassword());
        }
        @PostMapping("/update")
        public Login update (@RequestBody Login logPassword)
        {
            return service.update(logPassword);
        }
        @DeleteMapping("/delete/{login}")
        public boolean delete(@PathVariable String login)
        {
            return service.delete(login);
        }
//
        @GetMapping("/getAllAccounts")
        public Set<Login> getAll()
        {
            return service.getAll();
        }
//
    }


