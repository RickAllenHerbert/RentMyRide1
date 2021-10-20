package za.ac.cput.repository.clientAccount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.ClientAccount;
import za.ac.cput.repository.IRepository;

import java.util.Set;

@Repository
public interface IClientAccountRepository extends JpaRepository<ClientAccount, String>
{

}