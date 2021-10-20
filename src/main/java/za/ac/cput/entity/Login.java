package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/*
    @Description:  Login  Entity ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 04 June 2021
 */
@Entity
@Table(name ="Client_Accounts")
public class Login implements Serializable {

    private String userType,username,password;

    private Login(Builder builder)
    {
        this.userType = builder.userType;
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getUserType() {
        return userType;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public static class Builder {
        private String userType, username, password;

        public Builder setUserType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Login build() {
            return new Login(this);
        }

        public Builder copy(Login login) {
            this.userType = login.userType;
            this.username = login.username;
            this.password = login.password;
            return this;
        }

    }
    @Override
    public String toString() {
        return "Builder{" +
                "userType='" + userType + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
