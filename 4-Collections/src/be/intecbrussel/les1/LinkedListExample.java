package be.intecbrussel.les1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Likedlist maken

        LinkedList<String> list = new LinkedList<>();

        // Object toevoegen aan linkedlist

        list.add("Chaïma");
        list.add("Saif");
        list.add("Fatima");
        list.add("Reda");
        list.add("Mohammed");
        list.add("Karima");

        //Lijst doorlopen vie Iterator

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
