package be.intecbrussel.les1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollector2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc" , "" , "bc" , "efg" , "abcd", "" , "jkl");

        List filterend = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filterend List : " + filterend);

        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(" , "));
        System.out.println("Merged String: " + mergedString);
    }
}
