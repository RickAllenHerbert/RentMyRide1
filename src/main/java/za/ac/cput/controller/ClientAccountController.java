package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.ClientAccount;
import za.ac.cput.factory.ClientAccountFactory;
import za.ac.cput.service.ClientAccountService;

import java.util.Set;
@RestController
@RequestMapping ("/clientaccount")


public class ClientAccountController {

    @Autowired
    private ClientAccountService service;

    @PostMapping("/create")
//public String create(ClientAccount clientAccount)
//    {
//        return "account created";
//    }

    public ClientAccount create(@RequestBody ClientAccount accountNum)
    {
        ClientAccount newAccount = ClientAccountFactory.createClientAccount(accountNum.getAccountNum(), accountNum.getNumBorrowed());
        return service.create(newAccount);
    }
    @GetMapping("/read")
    public ClientAccount read (@RequestBody ClientAccount account)
    {
        return service.read(account.getAccountNum());
    }
    @PostMapping("/update")
    public ClientAccount update (@RequestBody ClientAccount accountNum)
    {
       return service.update(accountNum);
    }
   @DeleteMapping("/delete/{accountNum}")
   public boolean delete(@PathVariable String accountNum)
   {
      return service.delete(accountNum);
   }
//    public String ClientAccount(@RequestBody ClientAccount account)
//    {
//        if (service.delete(account.getAccountNum()))
//            return "Successfully deleted";
//        else
//            return "account wasn't successfully deleted";
//
//    }

    @GetMapping("/getAllAccounts")
    public Set<ClientAccount>getAll()
    {
        return service.getAll();
    }
//    @GetMapping("/getAccountStartWith51")
//    public Set<ClientAccount> getAccountStartWith51()
//    {
//        return service.getAll();
//    }
}
