package be.intecbrussel.les2;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //Geen duplicate element  + in volgorde zetten !!!!
        // Een TreeSet maken en elementen toevoegen
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(2);
        set.add(8);
        set.add(3);
        System.out.println("TreeSet : " +set);

        //Het eerste en laatste element v/d treeset opvragen
        Integer firtElement = set.first();
        Integer lastElement = set.last();
        System.out.println("First element: " +firtElement);
        System.out.println("last element: " +lastElement);

        // Een element in de treeset zoeken dat groter is dan een opgegeven waarde
        Integer higherValue = set.higher(5);
        System.out.println("Element higher than 5: " + higherValue);

        Integer lowerValue = set.lower(5);
        System.out.println("Element lower than 5: " + lowerValue);

        // De Treeset afdrukken in omgekeerde volgorde
        TreeSet<Integer> descendingSet = (TreeSet<Integer>) set.descendingSet();
        System.out.println("Descending TreeSet: " +descendingSet);

        //Een subset v/d TreeSet maken
        TreeSet<Integer> subSet = (TreeSet<Integer>) set.subSet(3,8);
        System.out.println("SubSet TreeSet : " +subSet);

        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println(set);
        System.out.println("Is HashSet empty? " + isEmpty);
    }
}
