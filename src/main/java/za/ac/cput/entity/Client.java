package za.ac.cput.entity;

/*
   @Description:Client.java -> Client class for Client Entity
   @Author: Cole Hanekom
   @Student Number: 217267556
   @Date: 3 June 2021
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Client implements Serializable {
    @Id
    private String clientID,name,surname,contactNumber, accountNumber;

    private Client(){}

    private Client(Builder builder) {
        this.clientID = builder.clientID;
        this.name = builder.name;
        this.surname = builder.surname;
        this.contactNumber = builder.contactNumber;
        this.accountNumber = builder.accountNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID='" + clientID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

    public String getClientID() {
        return clientID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static class Builder{
        private String clientID,name,surname,contactNumber, accountNumber;

        public Builder setClientID(String clientID) {
            this.clientID = clientID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }
        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }
        public Builder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Client build(){
            return new Client(this);
        }

        public Builder copy(Client client){
            this.clientID = client.clientID;
            this.name = client.name;
            this.surname = client.surname;
            this.contactNumber = client.contactNumber;
            this.accountNumber = client.accountNumber;
            return this;
        }
    }
}
