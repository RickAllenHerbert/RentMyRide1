package za.ac.cput.entity;

/*
   @Description:CarLot.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 4 June 2021
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarLot {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String parkingSpace, numberPlate;

private CarLot(Builder builder)
{
    this.parkingSpace = builder.parkingSpace;
    this.numberPlate = builder.numberPlate;
}

public static class Builder {
    private String parkingSpace, numberPlate;

    public Builder setParkingSpace(String parkingSpace) {
        this.parkingSpace = parkingSpace;
        return this;
    }

    public Builder setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
        return this;
    }

    public CarLot build(){
        return new CarLot(this);
    }

    public CarLot.Builder copy(CarLot carLot) {
        this.parkingSpace = carLot.parkingSpace;
        this.numberPlate = carLot.numberPlate;
        return this;

    }
}

    @Override
    public String toString() {
        return "CarLot{" +
                "parkingSpace='" + parkingSpace + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                '}';
    }

    public String getParkingSpace() {
        return parkingSpace;
    }

    public String getNumberPlate() {
        return numberPlate;
    }


}
