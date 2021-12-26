package ro.fasttrackit.curs12.homework.extramile;

public enum KmRange {
    LOW (1,100),
    MIDDLE(101,1000),
    HIGH(1001,10000);


    private int min;
    private int max;

    KmRange(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
