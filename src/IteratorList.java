public interface IteratorList <E> extends java.util.Iterator <E> {

    void reset();

    void insertAfter(E value);

    void insertBefore(E value);
}
