package mit.ei.gei.ecl1;

public class Cons<E> implements ImList<E> {

    private final E elt;
    private final ImList<E> rest;
    private int size = 0;

    public Cons(E elt, ImList<E> rest) {
        this.elt = elt;
        this.rest = rest;
    }

    public ImList<E> cons(E elt) {
        return new Cons<E>(elt, this);
    }

    public E first() {
        return elt;
    }

    public ImList<E> rest() {
        return rest;
    }
}