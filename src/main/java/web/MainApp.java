package web;

import web.dao.CarDaoImpl;

public class MainApp {
    public static void main(String[] args) {
        CarDaoImpl userDao = new CarDaoImpl();
        System.out.println(userDao.getSomeCar(1));
    }

}
