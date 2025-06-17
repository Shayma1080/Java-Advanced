package be.Intecbrussel.Oefeningen;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Oefening1Plus {
    public static void main(String[] args) {
        int[] numbers = {8, 1, 5, 6, 3, 4};
        System.out.println("Even getallen: ");
        printNumbers(numbers,"even");
        System.out.println("Oneven getalen: ");
        printNumbers(numbers,"oneven");

    }

    public static void printNumbers(int[] numbers, String type){
        IntPredicate filter;
        if(type.equalsIgnoreCase("even")){
            filter = n -> n % 2 ==0;
        }else if (type.equalsIgnoreCase("oneven")){
            filter =n -> n % 2 !=0;
        }else{
            System.out.println("Fout: geef 'even' of 'oneven' in.");
            return;
        }

        Arrays.stream(numbers).filter(filter).forEach(n -> System.out.println(n + " "));

    }
}
