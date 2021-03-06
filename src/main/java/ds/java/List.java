package ds.java;

public interface List<E> {
    void add(E e);

    void insert(E e, int position);

    E remove();

    E removeAt(int position);

    int size();

    E get(int position);

    boolean find(E e);

}
