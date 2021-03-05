package ds.java;

public interface Stack<X> {
    void push(X x);

    X pop();

    X access(X x);

    boolean contains(X x);

    int size();
}
