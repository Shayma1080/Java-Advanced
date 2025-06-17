package be.intecbrussel.Les1;

public class Duo <E>{
    private E first;
    private E secnde;

    public Duo(E first, E secnde) {
        this.first = first;
        this.secnde = secnde;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecnde() {
        return secnde;
    }

    public void setSecnde(E secnde) {
        this.secnde = secnde;
    }

    public void swap(){
        E temp = first;
        first=secnde;
        secnde=temp;
    }

    @Override
    public String toString() {
        return "Duo: " + "first=" + first + ", secnde=" + secnde;
    }
}
