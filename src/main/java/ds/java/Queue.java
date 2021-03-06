package ds.java;

public interface Queue<X> {
    void enqueue(X x);

    X dequeue();

    int size();

    boolean contains(X x);

    X access(int position);
}
