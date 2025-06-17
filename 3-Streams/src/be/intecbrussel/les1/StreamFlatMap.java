package be.intecbrussel.les1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMap {
    public static void main(String[] args) {
        try{
            long noIfWords = Files.lines(Paths.get("C:\\Users\\Intec\\OneDrive - INTEC BRUSSEL vzw\\Documents\\StreamFlatMap.txt"))
                    .flatMap(l -> Arrays.stream(l.split("")))
                    .distinct() //Unique woord, wordt niet 2 keer berekend of geprint
                    .count(); //altijd long gebruiken bij count
            System.out.println("No Of Words: " + noIfWords);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            List<String> uniqueWords = Files.lines(Paths.get("C:\\Users\\Intec\\OneDrive - INTEC BRUSSEL vzw\\Documents\\StreamFlatMap.txt"))
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println("Distinct woorden: ");
            uniqueWords.forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2),(Arrays.asList(3,4)));
        Stream<Integer> stream = list.stream().flatMap(Collection::stream);
        stream.forEach(System.out::println);
    }
}
