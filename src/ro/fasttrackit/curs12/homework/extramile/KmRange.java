package ro.fasttrackit.curs12.homework.extramile;

public enum KmRange {
    LOW,
    MIDDLE,
    HIGH;

    public static KmRange getKmValue (int value) {
        if (value < 501) {
            return LOW;
        } else if (value < 5001) {
            return MIDDLE;
        } else {
            return HIGH;
        }
    }
}
