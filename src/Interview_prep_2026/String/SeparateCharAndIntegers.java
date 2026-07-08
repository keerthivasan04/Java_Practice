package Interview_prep_2026.String;

public class SeparateCharAndIntegers {
    public static void main(String[] args) {
        String input = "Xy12Z3";
        String outputChar = input.replaceAll("[0-9]", "");
        String outputDigits = input.replaceAll("[a-zA-Z]", "");
        System.out.println(outputChar);
        System.out.println(outputDigits);
    }
}
