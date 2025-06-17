package be.intecbrussel.Les1;

public class ComparableDuo <T extends Comparable<T>> extends Duo<T> {
    T first;
    T second;


    public ComparableDuo(T first, T secnde) {
        super(first, secnde);
    }

    public T getHighest(){
        return getFirst().compareTo(getSecnde()) < 0 ? getSecnde() : getFirst();
    }

    public T getLowest(){
        return getFirst().compareTo(getSecnde()) < 0 ? getFirst() : getSecnde();
    }
}
