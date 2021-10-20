package za.ac.cput.service.clientAccount;

import za.ac.cput.entity.ClientAccount;
import za.ac.cput.service.IService;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

public interface IClientAccountService extends IService<ClientAccount, String> {
        public  Set<ClientAccount> getAll();
        public ClientAccount getClientAccountGivenDescription (String description);


}