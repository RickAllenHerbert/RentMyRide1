package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.ClientAccount;
import za.ac.cput.repository.clientAccount.IClientAccountRepository;
import za.ac.cput.service.clientAccount.IClientAccountService;


import java.util.stream.Collectors;
import java.util.Set;
/*
    @Description: Client Account Service ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 30 July 2021
 */

@Service
public class ClientAccountService implements IClientAccountService {
    private static ClientAccountService service = null;

    @Autowired
    private IClientAccountRepository repository;

    @Override
    public ClientAccount create(ClientAccount account) {
        return this.repository.save(account);
    }

    @Override
    public ClientAccount read(String accountNum) {
        return this.repository.findById(accountNum).orElse(null);
    }

    @Override
    public ClientAccount update(ClientAccount account) {
        if (this.repository.existsById(account.getAccountNum()))
            return this.repository.save(account);
        return null;
    }

    @Override
    public boolean delete(String accountNum) {
        this.repository.deleteById(accountNum);
        if (this.repository.existsById(accountNum))
            return false;
        else
            return true;
    }

    @Override
    public Set<ClientAccount> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public ClientAccount getClientAccountGivenDescription(String description) {
        return null;
    }


}
//    private static ClientAccountService service = null;
//    private ClientAccountRepository repo = null;
//
//    private ClientAccountService() {
//        this.repo = ClientAccountRepository.getRepository();
//    }
//
//    public static ClientAccountService getService(){
//        if(service == null){
//            service = new ClientAccountService();
//        }
//        return service;
//    }
//
//    @Override
//    public ClientAccount create(ClientAccount account) {
//        return this.repo.create(account);
//    }
//
//    @Override
//    public ClientAccount read(String accountID) {
//        return this.repo.read(accountID);
//    }
//
//    @Override
//    public ClientAccount update(ClientAccount account) {
//        return this.repo.update(account);
//    }
//
//    @Override
//    public boolean delete(String accountID) {
//        return this.repo.delete(accountID);
//    }
//
//    @Override
//    public Set<ClientAccount> getAll() {
//        return this.repo.getAll();
//    }
//
//    public Set<ClientAccount> getClientAccountWithNum15()
//    {
//        Set<ClientAccount> clientAccountsWithNum15 = null;
//        Set<ClientAccount> clientAccounts = getAll();
//        for (ClientAccount clientAccount : clientAccounts)
//        {
//            if(clientAccount.getAccountNum().trim().toLowerCase().startsWith("51"))
//            {
//                clientAccountsWithNum15.add(clientAccount);
//            }
//        }
//        return clientAccountsWithNum15;
//    }


