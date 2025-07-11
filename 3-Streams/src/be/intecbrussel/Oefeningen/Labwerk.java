package be.intecbrussel.Oefeningen;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Labwerk {
    //Oefening 1:
    public List<String> toUppercase(List<String> strings1) {
        strings1.stream()
                .map(s -> s.toUpperCase()) // kan ook zo gebruikt '.map(String::toUpperCase)'
                .collect(Collectors.toList()); // kan ook zo gebruikt '.toList'
        return strings1;
    }
    //Oefening 2:
    public List<String> filterA(List<String> strings2){

        strings2.stream()
                .filter(string ->string.startsWith("a"))
                .collect(Collectors.toList());
        return strings2;
    }

    //Oefening 3:
    public List<String> filterB(List<String> strings3){
        strings3.stream()
                .filter(e -> e.startsWith("a") && e.length() > 3)
                .collect(Collectors.toList());
        return strings3;
    }

    //Oefening 4:
    public List<String> filterC(List<String> strings4){
        return strings4.stream()
                .filter(e -> e.startsWith("a") && e.length()>3)
                //.sorted((p1,p2) -> p2.compareTo(p1)) //eerste manier
                //.sorted(Comparator.reverseOrder()) // tweede manier
                .map(e -> new StringBuilder(e).reverse().toString()) //derde manier
                .toList();

    }
    //Oefening 5:
    public List<String> filterD(List<String> strings5){
        strings5.stream()
                .filter(e -> e.startsWith("a") && e.length()>3)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(" ,"));

        return strings5;
    }
    //Oefening 6:
    public String filterE(List<String> strings6){
        return strings6.stream()
                .filter(e -> e.startsWith("a") && e.length()>3)
                .map(e -> e.toUpperCase())
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" ,"));

    }
    //Oefening 7:
    public Double gemiddelde(List<Double> intgers1) {
        DoubleSummaryStatistics stats = intgers1.stream()
                .filter(i -> i % 2 == 0)
                .mapToDouble(Double::doubleValue)
                .summaryStatistics();

        return stats.getCount() == 0 ? 0.0 : stats.getAverage();
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
    //Oefening 11:
    public List<Integer> geenDubble(List<Integer> integers3){
        integers3.stream()
                .distinct() // verwijdert dubbele elementen
                .forEach(System.out::println);

        return  integers3;
    }

}
