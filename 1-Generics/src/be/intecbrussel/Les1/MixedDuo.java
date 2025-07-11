package be.intecbrussel.Les1;

public class MixedDuo<E, T> {
    private E first;
    private T second;

    public MixedDuo(E first, T second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
