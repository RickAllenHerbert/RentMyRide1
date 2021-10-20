package za.ac.cput.entity;
/*
    @Description: ClientAccount Entity ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 04 June 2021
 */
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="Client_Accounts")
public class ClientAccount implements Serializable
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String accountNum, numBorrowed;
    private ClientAccount()
    {

    }
    private ClientAccount(Builder builder) {
        this.accountNum = builder.accountNum;
        this.numBorrowed = builder.numBorrowed;
    }
    public String getAccountNum() {
        return accountNum;
    }

    public String getNumBorrowed() {
        return numBorrowed;
    }

    public static class Builder {
        private String accountNum,numBorrowed;

        public Builder setAccountNum(String accountNum) {
            this.accountNum = accountNum;
            return this;
        }

        public Builder setNumBorrowed(String numBorrowed) {
            this.numBorrowed = numBorrowed;
            return this;
        }

        public ClientAccount build() {
            return new ClientAccount(this);
        }

        public Builder copy(ClientAccount clientAccount) {
            this.accountNum = clientAccount.accountNum;
            this.numBorrowed = clientAccount.numBorrowed;
            return this;
        }




    }
    @Override
    public String toString() {
        return "Client Account" +
                "accountNum=" + accountNum +
                ", numBorrowed=" + numBorrowed +
                '}';
    }
}

