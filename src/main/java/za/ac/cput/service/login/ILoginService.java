package za.ac.cput.service.login;

import za.ac.cput.entity.ClientAccount;
import za.ac.cput.entity.Login;
import za.ac.cput.service.IService;

import java.util.Set;

public interface ILoginService extends IService<Login,String>
{
    Set<Login> getAll();
    public Login getLoginGivenDescription (String description);
}
