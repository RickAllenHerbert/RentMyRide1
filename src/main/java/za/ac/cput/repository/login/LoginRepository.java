//package za.ac.cput.repository.login;
///*
//    @Description: Login Repository ->
//    @Author: Asiphiwe Hanjiwe
//    @Student Number: 218336675
//    @Date: 30 July 2021
// */
//import za.ac.cput.entity.Login;
//import za.ac.cput.repository.login.ILoginRepository;
//import java.util.HashSet;
//import java.util.Set;
//@Deprecated
//
//public class LoginRepository implements ILoginRepository {
//    private static LoginRepository repository = null;
//    private Set<Login> loginDB = null;
//
//    private LoginRepository()
//    {
//        loginDB = new HashSet<Login>();
//    }
//
//    public static LoginRepository getRepository()
//    {
//        if(repository == null)
//        {
//            repository = new LoginRepository();
//        }
//        return repository;
//    }
//
//
//    @Override
//    public Login create(Login newLoginDetails) {
//        boolean success = loginDB.add(newLoginDetails);
//        if(!success)
//            return null;
//        return newLoginDetails;
//    }
//
//    @Override
//    public Login read(String username) {
//        for (Login login: loginDB)
//            if (login.getUsername().equals(username))
//            {
//                return login;
//            }
//        return null;
//    }
//
//    @Override
//    public Login update(Login newLoginDetails) {
//        Login oldLogin = read(newLoginDetails.getUsername());
//        if (oldLogin!=null)
//        {
//            loginDB.remove(oldLogin);
//            loginDB.add(newLoginDetails);
//            return newLoginDetails;
//        }
//        return null;
//    }
//
//    @Override
//    public boolean delete(String username) {
//        Login usernameDeleted = read(username);
//        if(usernameDeleted == null)
//            return false;
//        loginDB.remove(usernameDeleted);
//        return true ;
//    }
//
//    @Override
//    public Set<Login> getAll() {
//        return loginDB;
//    }
//}
