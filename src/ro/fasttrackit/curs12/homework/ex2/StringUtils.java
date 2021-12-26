package ro.fasttrackit.curs12.homework.ex2;

public class StringUtils {
    public static String ensureNotEmpty (String word) {
        return word == null || "".equals(word.trim()) ? "n/a" : word;
    }

    public static int validAge (int age) {
        return age <= 100 && age > 0 ? age : 1;
    }

    public static int positiveValue (int value) {
        return value <0 ? 0 : value;
    }
}
