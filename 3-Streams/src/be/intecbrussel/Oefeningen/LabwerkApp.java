package be.intecbrussel.Oefeningen;

import java.util.Arrays;
import java.util.List;

public class LabwerkApp {
    public static void main(String[] args) {
        Labwerk labwerk = new Labwerk();

        //Oefening 1:
        List<String> mystring1 = Arrays.asList("hello", "intec", "brussel");
        labwerk.toUppercase(mystring1);

        //Oefening 2:
        List<String> mystring2 = Arrays.asList("Basilic", "World", "waar", "is", "daar");
        labwerk.filterA(mystring2);
        //Oefening 3:
        labwerk.filterB(mystring2);

        //Oefening 4:
        labwerk.filterC(mystring2);
    }
}
