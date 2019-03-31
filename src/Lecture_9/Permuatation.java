package Lecture_9;

public class Permuatation {
    public static void main(String[] args) {
        permuatation("", "abc");
    }

    public static void permuatation(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);

            permuatation(first + ch + second, unprocessed);
        }
    }
}