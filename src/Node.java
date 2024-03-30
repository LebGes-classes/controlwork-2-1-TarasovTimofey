package src;

public class Node<T> {
    public T data;
    Node<T> next;
    Node<T> prev;
    public Node(T data) {
        this.data = data;
    }
}

