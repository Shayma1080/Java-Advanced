package be.intecbrussel.Les1;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> myString = new Duo<>("Chaïma","Hajji");
        System.out.println(myString.getFirst() + " " + myString.getSecnde());
        myString.swap();
        System.out.println(myString);

        Duo<Integer> myInt = new Duo<>(3,6);
        System.out.println(myInt.getFirst() + myInt.getSecnde());
        myInt.swap();
        System.out.println(myInt);
    }
}
