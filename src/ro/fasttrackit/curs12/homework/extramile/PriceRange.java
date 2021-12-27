package ro.fasttrackit.curs12.homework.extramile;

import org.w3c.dom.html.HTMLDOMImplementation;

public enum PriceRange {
    CHEAP(0,6000),
    MEDIUM(6001,10000),
    EXPENSIVE(10001,100000);

    private int min;
    private int max;

    PriceRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        if (max < 6001) {
            return "CHEAP";
        } else if (max < 100001) {
            return "MEDIUM";
        } else {
            return "EXPENSIVE";
        }
    }

    public static PriceRange getPriceValue (int value) {
        PriceRange priceForCar;
        if (value < 6001) {
            priceForCar = CHEAP;
        } else if (value < 10001) {
            priceForCar = MEDIUM;
        } else {
            priceForCar = EXPENSIVE;
        }
        return priceForCar;
    }
}

