package ro.fasttrackit.curs12.homework.extramile;

public enum KmRange {
    LOW (1,500),
    MIDDLE(501,5000),
    HIGH(5001,10000);


    private int min;
    private int max;

    KmRange(int min, int max) {
        this.min = min;
        this.max = max;
    }


    @Override
    public String toString() {
        if (max < 501) {
            return "LOW";
        } else if (max < 5001) {
            return "MIDDLE";
        } else {
            return "HIGH";
        }
    }
    public static KmRange getKmValue (int value) {
        KmRange rangeForCar;
        if (value < 501) {
            rangeForCar = LOW;
        } else if (value < 5001) {
            rangeForCar = MIDDLE;
        } else {
            rangeForCar = HIGH;
        }
        return rangeForCar;
    }
}
