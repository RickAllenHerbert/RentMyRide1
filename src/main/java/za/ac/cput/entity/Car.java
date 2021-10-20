package za.ac.cput.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/* Car.java
   Entity for the Car
   Author: Rick Allen Herbert (219014337)
   Date: 05 June 2021
*/
@Entity
public class Car implements Serializable {

    @Id
    private String numberPlate;
    private String color;
    private String make;
    private String model;
    private double rentalPrice;
    private String location;
    private boolean rented;

    public Car() {};

    public Car(Builder builder) {
        this.numberPlate = builder.numberPlate;
        this.color = builder.color;
        this.make = builder.make;
        this.model = builder.model;
        this.rentalPrice = builder.rentalPrice;
        this.location = builder.location;
        this.rented = builder.rented;
    }

    public static class Builder {

        private String numberPlate;
        private String color;
        private String make;
        private String model;
        private double rentalPrice;
        private String location;
        private boolean rented;

        public Builder numberPlate(String numberPlate) {
            this.numberPlate = numberPlate;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder rentalPrice(double rentalPrice) {
            this.rentalPrice = rentalPrice;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder rented(boolean rented) {
            this.rented = rented;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
        public Builder copy(Car car){
            this.numberPlate = car.numberPlate;
            this.color = car.color;
            this.make = car.make;
            this.model = car.model;
            this.rentalPrice = car.rentalPrice;
            this.location = car.location;
            this.rented = car.rented;
            return this;
        }
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public String getLocation() {
        return location;
    }

    public boolean availabilityStatus() {
        return rented;
    }

    @Override
    public String toString() {
        return "CAR INFORMATION: \nNumber Plate: " + numberPlate + "\nColor: " + color + "\nMake: " + make + "\nModel: " + model;
    }
}