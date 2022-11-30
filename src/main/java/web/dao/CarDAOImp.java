package web.dao;

import web.model.Car;

import java.util.ArrayList;


public class CarDAOImp implements CarDAO{

    private ArrayList<Car> carsList = new ArrayList<>() {
        {
            add(new Car("BMW", "525", 1999));
            add(new Car("Nissan", "GT-R", 2010));
            add(new Car("Audi", "80", 1992));
            add(new Car("Toyota", "Alphard", 2007));
            add(new Car("Mercedes", "E 200", 2017));

        }
    };

    public ArrayList<Car> cars() {
        return carsList;
    }
}
