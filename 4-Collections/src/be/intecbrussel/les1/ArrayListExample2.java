package be.intecbrussel.les1;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Gent");

        // We voegen een herhalende element toe
        cities.add("Leuven");

        // We voegen een element toe aan de index die we willen
        cities.add(3,"Genk");

        System.out.println("ArrayList -> ");
        cities.forEach(city -> System.out.println(city + " "));

    }
}
