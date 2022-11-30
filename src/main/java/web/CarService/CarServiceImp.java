package web.CarService;

import web.model.Car;

import java.util.ArrayList;

public class CarServiceImp implements CarService{
    @Override
    public ArrayList<Car> getCars(ArrayList<Car> cars, int i) {
        ArrayList<Car> result = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            result.add(cars.get(j));
        }

        return result;
    }
}
