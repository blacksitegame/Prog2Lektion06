package Opgave04;

public class Opgave04Main {
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
