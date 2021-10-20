package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.MultiPurposeUser;
import za.ac.cput.repository.login.IMultiPurposeUserRepository;
import za.ac.cput.service.multiServiceRepository.IMultiPurposeUserService;

import javax.persistence.EntityNotFoundException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MultiPurposeUserService implements IMultiPurposeUserService {
    private IMultiPurposeUserRepository repository;

    @Autowired
    private MultiPurposeUserService(IMultiPurposeUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public MultiPurposeUser create(MultiPurposeUser t) {
        return this.repository.save(t);
    }

    @Override
    public MultiPurposeUser read(String s) {
        return this.repository.findById(s).orElseThrow(() -> new EntityNotFoundException("User with id " + s + " was not found" ));
    }

    @Override
    public MultiPurposeUser update(MultiPurposeUser t) {
        if(this.repository.existsById(t.getId()))
            return this.repository.save(t);
        return null;
    }

    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if(this.repository.existsById(s))
            return false;
        else
            return true;
    }

    @Override
    public Set<MultiPurposeUser> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public MultiPurposeUser Login(String username, String password) {
        Set<MultiPurposeUser> users = getAll();
        for(MultiPurposeUser user : users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
