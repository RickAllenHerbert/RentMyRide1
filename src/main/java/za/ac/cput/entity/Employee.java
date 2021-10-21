package za.ac.cput.entity;
/*
    @Description:Employees Entity ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 3rd June 2021
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    private String employeeNumber;
    private String name, surname, userType, username, password;

    public Employee() {}
    private Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.name = builder.name;
        this.surname = builder.surname;
        this.userType = builder.userType;
        this.username = builder.username;
        this.password = builder.password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", userType='" + userType + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
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
        private String employeeNumber, name, surname, userType, username, password;

         public Builder setEmployeeNumber(String employeeNumber){
        this.employeeNumber = employeeNumber;
        return this;
        }
        public Builder setName(String name){
        this.name = name;
        return this;
         }
        public Builder setSurname(String surname){
        this.surname = surname;
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
        public Employee build(){
             return new Employee(this);
        }

        public Builder copy(Employee employee){
            this.employeeNumber = employee.employeeNumber;
            this.name = employee.name;
            this.surname = employee.surname;
            this.userType = employee.userType;
            this.username = employee.username;
            this.password = employee.password;
                return this;
        }

    }//Inner Class
}//Outer Class
