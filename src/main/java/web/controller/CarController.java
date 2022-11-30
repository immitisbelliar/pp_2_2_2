package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService.CarService;
import web.CarService.CarServiceImp;
import web.dao.CarDAO;
import web.dao.CarDAOImp;
import web.model.Car;

import java.util.ArrayList;


@Controller
public class CarController {

    private final CarService carService = new CarServiceImp();
    private final CarDAO carDAO = new CarDAOImp();
    private final ArrayList<Car> carsList = carDAO.cars();


    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        ArrayList<Car> cars = new ArrayList<>(carsList);

        if (count != null && count < 5) {
            cars = carService.getCars(carsList, count);
        }

        model.addAttribute("cars", cars);

        return "cars";
    }

}
