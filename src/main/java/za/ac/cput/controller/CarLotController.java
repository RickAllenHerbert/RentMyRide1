package za.ac.cput.controller;

/*
   @Description:CarLotController.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 17 June 2021
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.CarLot;
import za.ac.cput.factory.CarLotFactory;
import za.ac.cput.service.CarLotService;

import java.util.Set;

@RestController
@RequestMapping("/carlot")
public class CarLotController {

    @Autowired
    private CarLotService carLotService;

    @RequestMapping(value = "/create")
    public CarLot create(@RequestBody CarLot carLot) {
        CarLot newCarLot = CarLotFactory.createCarLot(
                carLot.getNumberPlate(),
                carLot.getParkingSpace()
        );
        return carLotService.create(newCarLot);
    }
    @GetMapping("/read/{numberPlate}")
    public CarLot read(@PathVariable String numberPlate) {
        return carLotService.read(numberPlate);
    }

    @RequestMapping("/update")
    public CarLot update(@RequestBody CarLot carLot) {
        CarLot updateCarLot = carLotService.update(carLot);
        return updateCarLot;
    }

    @RequestMapping("/delete")
    public String delete(@RequestBody CarLot carLot) {
        if(carLotService.delete(carLot.getNumberPlate()))
            return "You have successfully deleted the record";
            return "An error has occurred";
    }

    @RequestMapping("/getall")
    public Set<CarLot> getAll() {
        return carLotService.getAll();
    }

}
