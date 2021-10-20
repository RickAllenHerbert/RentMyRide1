package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class MultiPurposeUser implements Serializable {
    @Id
    private String id;
    private String username, password, userType;

    public MultiPurposeUser() {}
    private MultiPurposeUser(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
        this.userType = builder.userType;
    }

    public String getId() {
        return id;
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

    public static class Builder{
        private String id, userType, username, password;

        public Builder setId(String id){
            this.id = id;
            return this;
        }
        public Builder setUserType(String userType){
            this.userType = userType;
            return this;
        }
        public Builder setUsername(String username){
            this.username = username;
            return this;
        }
        public Builder setPassword(String password){
            this.password = password;
            return this;
        }
        public MultiPurposeUser build(){
            return new MultiPurposeUser(this);
        }

        public Builder copy(MultiPurposeUser multiPurposeUser){
            this.id = multiPurposeUser.id;
            this.userType = multiPurposeUser.userType;
            this.username = multiPurposeUser.username;
            this.password = multiPurposeUser.password;
            return this;
        }

    }//Inner Class
}
