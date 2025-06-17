package be.intecbrussel.Oefeningen;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;
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

        System.out.println(strings2.stream().filter(string ->string.startsWith("a")).collect(Collectors.toList()));
        return strings2;
    }

    //Oefening 3:
    public List<String> filterB(List<String> strings3){
        System.out.println(strings3.stream().filter(e -> e.startsWith("a") && e.length() > 3).collect(Collectors.toList()));
        return strings3;
    }

    //Oefening 4:
    public List<String> filterC(List<String> strings4){
        List<String> filterend = strings4.stream()
                .filter(e -> e.startsWith("a") && e.length()>3)
                .sorted((p1,p2) -> p2.compareTo(p1)) //eerste manier
                //.sorted(Comparator.reverseOrder()) // tweede manier
                .collect(Collectors.toList());
        System.out.println(filterend);

        return filterend;
    }
    //Oefening 5:
    public List<String> filterD(List<String> strings5){
        String n = strings5.stream()
                .filter(e -> e.startsWith("a") && e.length()>3)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(" ,"));
        System.out.println(n);
        return strings5;
    }
    //Oefening 6:
    public List<String> filterE(List<String> strings6){
        String n = strings6.stream()
                .filter(e -> e.startsWith("a") && e.length()>3)
                .map(e -> e.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(" ,"));
        System.out.println(n);
        return strings6;
    }
    //Oefening 7:
    public List<Integer> gemiddelde(List<Integer> intgers1){
        int even = intgers1.stream()
                .filter(i -> i %2 == 0)
                .reduce(0,(a,b) -> a+b);
        System.out.println(even);
        return intgers1;
    }
    //Oefening 8:
    public List<String> lengte(List<String> strings7){
        String myString = strings7.stream()
                .reduce("",(s1,s2) ->s1.length() >= s2.length()? s1: s2);
        System.out.println(myString);
        return strings7;
    }
    //Oefening 9:
    public List<Integer> evenGetallen(List<Integer> intgers2){
         intgers2.stream()
                .filter(i -> i %2 == 0)
                 .forEach(System.out::println);
        return intgers2;
    }
    //Oefening 10:
    public List<String> vindenWoord(List<String> strings8){
        strings8.stream()
                .filter(e -> e.startsWith("aap"))
                .forEach((e ) -> System.out.println(e));

        return  strings8;
    }
    //Oefening 10:
    public List<Integer> geenDouble(List<Integer> integers3){
        integers3.stream()
                .distinct() // verwijdert dubbele elementen
                .forEach(System.out::println);

        return  integers3;
    }

}
