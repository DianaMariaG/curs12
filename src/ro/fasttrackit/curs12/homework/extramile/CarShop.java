package ro.fasttrackit.curs12.homework.extramile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarShop {
    private final List<Car> listOfCars;

    public CarShop (List<Car> listOfCars) {
        if (listOfCars == null) {
            this.listOfCars = new ArrayList<>();
        } else {
            this.listOfCars = new ArrayList<>(listOfCars);
        }
    }

    public Map<String,Integer> mapNameToCarNumber() {
        Map<String,Integer> result = new HashMap<>();
        for (Car car : listOfCars) {
            if (result.containsKey(car.getName())) {
                result.put(car.getName(), result.get(car.getName())+ 1); //override la key car.getKm
            } else {
                result.put(car.getName(),1);
            }
        }
        return result;
    }

//    public Map<KmRange, List<Car>> //switch intre km range
}
