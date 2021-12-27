package ro.fasttrackit.curs12.homework.extramile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ro.fasttrackit.curs12.homework.extramile.KmRange.*;
import static ro.fasttrackit.curs12.homework.extramile.PriceRange.getPriceValue;

public class CarShop {
    private final List<Car> listOfCars;

    public CarShop (List<Car> listOfCars) {
        if (listOfCars == null) {
            this.listOfCars = new ArrayList<>();
        } else {
            this.listOfCars = new ArrayList<>(listOfCars);
        }
    }

    public Map<String,Integer> mapNameToCarsNumber() {
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

    public Map<String, Integer> mapNameToSumKm(){
        Map<String,Integer> result = new HashMap<>();
        for (Car car : listOfCars) {
            if (result.containsKey(car.getName())) {
                result.put(car.getName(),result.get(car.getName()) + car.getKm());
            } else {
                result.put(car.getName(),car.getKm());
            }
        }
        return result;
    }

    public Map<KmRange, List<Car>> mapKmRangeToListOfCars() {
        Map<KmRange, List<Car>> result = new HashMap<>();
        for (Car car : listOfCars) {
            KmRange rangeForCar = getKmValue(car.getKm());
            List<Car> cars = result.get(rangeForCar);

            if (cars == null) {
                cars = new ArrayList<>();
                result.put(rangeForCar,cars);
            }
            cars.add(car);
        }
        return result;
    }

    public Map<PriceRange,List<Car>> mapPriceRangeToListOfCars() {
        Map<PriceRange,List<Car>> result = new HashMap<>();
        for (Car car : listOfCars) {
            PriceRange priceForCar = getPriceValue(car.getPrice());
            List<Car> cars = result.get(priceForCar);

            if (cars == null) {
                cars = new ArrayList<>();
                result.put(priceForCar,cars);
            }
            cars.add(car);
        }
        return result;
    }
}
