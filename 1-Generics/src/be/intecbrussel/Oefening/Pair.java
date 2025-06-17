package be.intecbrussel.Oefening;

public class Pair <E>{
    private E fisrt;
    private E second;

    public Pair(E fisrt, E second) {
        this.fisrt = fisrt;
        this.second = second;
    }

    public E getFisrt() {
        return fisrt;
    }

    public void setFisrt(E fisrt) {
        this.fisrt = fisrt;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "fisrt=" + fisrt +
                ", second=" + second +
                '}';
    }
}
