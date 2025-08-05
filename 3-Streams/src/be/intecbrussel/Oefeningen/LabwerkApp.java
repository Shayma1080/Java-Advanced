package be.intecbrussel.Oefeningen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class LabwerkApp {
    public static void main(String[] args) {
        Labwerk labwerk = new Labwerk();

        //Oefening 1:
        System.out.println("Oefening 1: ");
        List<String> mystring1 = Arrays.asList("basilic", "world", "ardennen", "is", "daar","appel","aap");
        labwerk.toUppercase(mystring1);

        //Oefening 2:
        System.out.println("\nOefening 2: ");
        labwerk.filterA(mystring1);

        //Oefening 3:
        System.out.println("\nOefening 3: ");
        labwerk.filterB(mystring1);

        //Oefening 4:
        System.out.println("\nOefening 4: ");
        System.out.println(labwerk.filterC(mystring1));

        //Oefening 5:
        System.out.println("\nOefening 5: ");
        System.out.println(labwerk.filterD(mystring1));

        //Oefening 6:
        System.out.println("\nOefening 6: ");
        System.out.println(labwerk.filterE(mystring1));

        //Oefening 7:
//        System.out.println("\nOefening 7: ");
        List<Integer> numbers = Arrays.asList(6,7,3,22,5,3);
//        List<Double> numbers1 = Arrays.asList(6.1,7,3,22,5.4,3);
//        Labwerk app = new Labwerk();
//        Double resultaat = app.gemiddelde(numbers1);

//        System.out.println("Gemiddelde van even getallen: " + resultaat);

        //Oefening 8:
        System.out.println("\nOefening 8: ");
        labwerk.lengte(mystring1);

        //Oefening 9:
        System.out.println("\nOefening 9: ");
        labwerk.evenGetallen(numbers);

        //Oefening 10:
        System.out.println("\nOefening 10: ");
        labwerk.vindenWoord(mystring1);

        //Oefening 11:
        System.out.println("\nOefening 11: ");
        labwerk.geenDubble(numbers);
    }
}
