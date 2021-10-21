package za.ac.cput.service;

/*
   @Description:CarLotService.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 02 August 2021
 */

import org.springframework.stereotype.Service;
import za.ac.cput.entity.CarLot;
import za.ac.cput.repository.carlot.CarLotRepository;
import za.ac.cput.service.carlot.ICarLotService;

import java.util.Set;

@Service
public class CarLotService implements ICarLotService{
    private static  CarLotService service = null;
    private CarLotRepository repository = null;

    private CarLotService(){this.repository = CarLotRepository.getRepository();}

    public static CarLotService getService(){
        if(service == null){
            service = new CarLotService();
        }
        return service;
    }
    @Override
    public CarLot create(CarLot carLot){return this.repository.create(carLot);}

    @Override
    public CarLot read(String numberPlate){return this.repository.read(numberPlate);}

    @Override
    public CarLot update(CarLot carLot){return this.repository.update(carLot);}

    @Override
    public boolean delete(String numberPlate){return this.repository.delete(numberPlate);}

    @Override
    public Set<CarLot> getAll(){return  this.repository.getAll();}


}
