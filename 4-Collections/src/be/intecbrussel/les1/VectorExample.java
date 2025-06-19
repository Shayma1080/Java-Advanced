package be.intecbrussel.les1;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Chaïma");
        vector.add("Saif");
        vector.add("Fatima");
        vector.add("Reda");
        vector.add("Mohammed");
        vector.add("Karima");

        Iterator itr = vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
