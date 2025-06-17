package be.intecbrussel.Oefeningen;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Labwerk {
    //Oefening 1:
    public List<String> toUppercase(List<String> strings1) {
        System.out.println(strings1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList()));
        return strings1;
    }
    //Oefening 2:
    public List<String> filterA(List<String> strings2){

        System.out.println(strings2.stream().filter(string ->string.contains("a")).collect(Collectors.toList()));
        return strings2;
    }

    //Oefening 3:
    public List<String> filterB(List<String> strings3){
        System.out.println(strings3.stream().filter(e -> e.contains("a") && e.length() > 3).collect(Collectors.toList()));
        return strings3;
    }

    //Oefening 4:
    public List<String> filterC(List<String> strings4){
        strings4.stream().filter(e -> e.startsWith("a")).map(e -> e.length()>3).limit(5).sorted(p1,p2 -> p2.Compareto).forEach(e -> System.out.println(e));

        return reverse;
    }

}
