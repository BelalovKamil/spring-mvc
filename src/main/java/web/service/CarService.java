package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getSomeCar(int count);

    List<Car> getAllCar();
}
