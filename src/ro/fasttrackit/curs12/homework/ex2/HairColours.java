package ro.fasttrackit.curs12.homework.ex2;

public enum HairColours {
    BLONDE("blonde"),
    BROWN("brown"),
    BLACK("black"),
    RED("red"),
    POLYCHROMATIC("polychromatic");

    private String value;

    HairColours(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
