package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Audi", 2021, 4.0));
        carList.add(new Car("BMW", 1975, 2.3));
        carList.add(new Car("Volkswagen", 1988, 1.8));
        carList.add(new Car("Renault", 1992, 2.7));
        carList.add(new Car("Mazda", 2012, 3.0));
    }


    @Override
    public List<Car> getSomeCar(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getAllCar() {
        return carList;
    }
}
