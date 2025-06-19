package be.intecbrussel.les1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
    public static void main(String[] args) {
        //ArrayList maken
        ArrayList<String> list = new ArrayList<>();

        list.add("Chaïma");
        list.add("Saif");
        list.add("Fatima");
        list.add("Reda");

        Iterator itr = list.iterator();//levert een iterator op van de collectie
        while(itr.hasNext()){ //controleert of er nog een volgende element is
            System.out.println(itr.next()); //geeft het volgende elemen terug
        }

        //of op een simplere manier
//        list.forEach(e-> System.out.print(e +" "));
    }
}
