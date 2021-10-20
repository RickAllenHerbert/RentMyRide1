package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.ClientAccount;
import za.ac.cput.entity.Login;
import za.ac.cput.repository.clientAccount.IClientAccountRepository;
import za.ac.cput.repository.login.ILoginRepository;

import za.ac.cput.service.login.ILoginService;
import java.util.Set;
import java.util.stream.Collectors;

/*
    @Description: Login Service ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 30 July 2021
 */
public class LoginService implements ILoginService {
    private static LoginService service = null;
      private ILoginRepository repo = null;

    @Autowired
    private ILoginRepository repository;

    @Override
    public Login create(Login log) {
        return this.repository.save(log);
    }

    @Override
    public Login read(String logId) {
        return this.repository.findById(logId).orElse(null);
    }

    @Override
    public Login update(Login log) {
        if (this.repository.existsById(log.getPassword()))
            return this.repository.save(log);
        return null;
    }

    @Override
    public boolean delete(String logId) {
        this.repository.deleteById(logId);
        if (this.repository.existsById(logId))
            return false;
        else
            return true;
    }

    @Override
    public Set<Login> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Login getLoginGivenDescription(String description) {
        return null;
    }

}
