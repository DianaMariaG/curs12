package ro.fasttrackit.curs12.homework.extramile;

import ro.fasttrackit.curs12.homework.ex2.StringUtils;

import java.util.Objects;

import static ro.fasttrackit.curs12.homework.ex2.StringUtils.*;

public class Car {
    private final String name;
    private final int age;
    private final int km;
    private final int price;

    public Car (String name, int age, int km, int price) {
        this.name = ensureNotEmpty(name);
        this.age = positiveValue(age);
        this.km = positiveValue(km);
        this.price = positiveValue(price);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKm() {
        return km;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && km == car.km && price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, km, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", km=" + km +
                ", price=" + price +
                '}';
    }
}
