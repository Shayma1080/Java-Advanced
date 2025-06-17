package be.Intecbrussel.Les1;

public class Lambdas {
    public static void main(String[] args) {

        Printable lambdaPrintble = (s) -> {
            return "Miauw " + s;
        };
        printThing(lambdaPrintble);

    }

    static void printThing(Printable thing){
        thing.print("!");
    }
}
