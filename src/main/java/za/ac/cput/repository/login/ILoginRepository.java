package za.ac.cput.repository.login;
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.ClientAccount;
import za.ac.cput.entity.Login;
import za.ac.cput.repository.IRepository;
import java.util.Set;

/*
    @Description: Interface Login Repository ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 30 July 2021
 */
public interface ILoginRepository extends JpaRepository<Login, String> {


}
