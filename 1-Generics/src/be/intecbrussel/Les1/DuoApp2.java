package be.intecbrussel.Les1;

public class DuoApp2 {
    public static void main(String[] args) {
        IntegerDuo intDuo = new IntegerDuo(5,7);
        StringDuo stringDuo = new StringDuo("Hello", "World");

        intDuo.swap();
        System.out.println(intDuo.getFirst());
        System.out.println(intDuo.getSecnde());
        System.out.println("----------------");

        String first = stringDuo.getFirst();
        String second = stringDuo.getSecnde();
        System.out.println(first+ " " + second);
    }
}
