package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDaoImpl;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDaoImpl = carDao;
    }

    @Override
    public List<Car> getSomeCar(int count) {
        return carDaoImpl.getSomeCar(count);
    }

    @Override
    public List<Car> getAllCar() {
        return carDaoImpl.getAllCar();
    }
}