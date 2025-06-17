package be.Intecbrussel.Les1;

public class Cat implements Printable{
     private String name;
     private int age;

     public Cat(){}


    @Override
    public String print(String suffix) {
        System.out.println("----");
        return suffix;
    }
}
