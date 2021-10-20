package za.ac.cput.service.multiServiceRepository;

import za.ac.cput.entity.MultiPurposeUser;
import za.ac.cput.service.IService;

import java.util.Set;

public interface IMultiPurposeUserService extends IService<MultiPurposeUser, String> {
    Set<MultiPurposeUser> getAll();
    MultiPurposeUser Login(String username, String password);
}
