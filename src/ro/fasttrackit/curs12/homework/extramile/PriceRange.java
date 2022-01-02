package ro.fasttrackit.curs12.homework.extramile;

public enum PriceRange {
    CHEAP,
    MEDIUM,
    EXPENSIVE;

    public static PriceRange getPriceValue (int value) {
        if (value < 6001) {
            return CHEAP;
        } else if (value < 10001) {
            return MEDIUM;
        } else {
            return EXPENSIVE;
        }
    }
}

