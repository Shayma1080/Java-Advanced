package be.Intecbrussel.Oefeningen;

import java.util.Arrays;

public class Oefening1 extends Oefening1Plus {
    public static void main(String[] args) {
        int[] numbers = {8, 1, 5, 6, 3, 4};
        Arrays.stream(numbers).filter(n-> n%2==0).forEach(n -> System.out.print(n + " "));

    }
}
