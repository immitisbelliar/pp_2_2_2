package web.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;

@Service
public class CarServiceImp implements CarService{

    private final CarDAO carDAO;

    @Autowired
    public CarServiceImp(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @Override
    public ArrayList<Car> getCars(Integer i) {
        ArrayList<Car> result = new ArrayList<>();
        ArrayList<Car> carsList = carDAO.getCarsList();

        if (i != null && i < 5) {
            for (int j = 0; j < i; j++) {
                result.add(carsList.get(j));
            }

            return result;
        }



        return carsList;
    }
}
