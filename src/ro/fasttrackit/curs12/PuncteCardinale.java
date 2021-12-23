package ro.fasttrackit.curs12;

public enum PuncteCardinale {
    NORD("N"), //nu sunt String-uri, ci Obiecte: se creeaza o constanta de tipul enumului
    SUD("S"),
    EST("E"),
    VEST("V");

    private final String prescurtare;

    PuncteCardinale(String prescurtare) {
        this.prescurtare = prescurtare;
    }
    public String getPrescurtare() {
        return prescurtare;
    }

    public String toDirection(){
        return switch (this){
            case NORD -> "UP";
            case SUD -> "DOWN";
            case EST -> "RIGHT";
            case VEST -> "LEFT";
        };
    }
}
//class MyPuncteCardinale {
//    public static final MyPuncteCardinale NORD = new MyPuncteCardinale();
//}



