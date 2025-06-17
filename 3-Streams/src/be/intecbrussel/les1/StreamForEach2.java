package be.intecbrussel.les1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamForEach2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jai");
        list.add("lopen");
        list.add("ziengen");
        list.add("schreeuwen");
        list.add("koken");
        list.add("Raden");
        list.add("Eten");

        //list.forEach((name) -> System.out.println(name)); // lambda method
        list.forEach(System.out::println);

        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);
    }
}
