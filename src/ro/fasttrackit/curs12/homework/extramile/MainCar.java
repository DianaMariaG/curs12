package ro.fasttrackit.curs12.homework.extramile;

import java.util.List;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo",1,500,5000);
        Car car2 = new Car("Audi",3,6000,12000);
        Car car3 = new Car("Toyota",7,7000,10500);
        Car car4 = new Car("Audi",3,100000,150000);

        CarShop cars = new CarShop(List.of(car1,car2,car3,car4));

        System.out.println(cars.mapNameToCarsNumber());
        System.out.println(cars.mapNameToSumKm());

        System.out.println(cars.mapPriceRangeToListOfCars());
        System.out.println(cars.mapKmRangeToListOfCars());
    }
}
