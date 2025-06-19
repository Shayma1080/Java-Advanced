package be.intecbrussel.les1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Eeen Queue maken en element toevoegen
        Queue<String> queque = new LinkedList<>();
        queque.offer("Chaïma");
        queque.offer("Saif");
        queque.offer("Fatima");

        System.out.println("Queque: " + queque);

        //Het element aan de voorkant v/d Queue opvragen zonder het te verwijderen
        String frontElement = queque.peek();
        System.out.println("Front element: " + frontElement);

        //Het element aan de voorkant v/d Queue opvragen en verwijderen
        String removedElement = queque.poll();
        System.out.println("Removed element: " +removedElement);
        System.out.println("Update Queue : " + queque);

        //Controleren of de Queue leeg is
        boolean isEmpty = queque.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);

        // De grote v/d Queue aanvragen
        int size = queque.size();
        System.out.println("Size of Queue: " + size);

        String all = queque.remove();
        System.out.println("alles removed: " + all);
        System.out.println("update: " +queque);
    }
}
