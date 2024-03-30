package src;

public interface IQueue<T> {
    Node<T> element();
    boolean offer(T data);
    Node<T> peek();
    Node<T> pool();
    Node<T> remove ();
    void clear();
    String toString ();
}
