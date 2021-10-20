package za.ac.cput.factory;

import za.ac.cput.entity.Login;
import za.ac.cput.entity.MultiPurposeUser;

public class MultiPurposeUserFactory {
    public static MultiPurposeUser createMultiLogin(String id, String username, String password, String userType)
    {

        MultiPurposeUser multiPurposeUser = new MultiPurposeUser.Builder()
                .setId(id)
                .setUserType(userType)
                .setUsername(username)
                .setPassword(password)
                .build();
        return multiPurposeUser;
    }
}
