package src;

import java.util.NoSuchElementException;

public class Queue<T> implements IQueue<T> {  //очередь на основе двусвязного списка
    Node<T> head;
    Node<T> end;
    int size;
    public Queue() {}
    Queue(T ... data) {
        head = new Node<>(data[0]);
        size++;
        Node<T> cur = head;
        for (int i = 1; i < data.length; i++) {
            cur.prev = new Node<>(data[i]);
            cur.prev.next = cur;
            cur = cur.next;
            size++;
        }
        head = cur;
    }

    public Node<T> peek() { // возвращает голову или возвращает null
        if (head != null) {
            return head;
        }
        return null;
    }

    public Node<T> element() { // возвращает голову или прокидывает исключения
        if (head != null) {
            return head;
        }
        throw new NoSuchElementException();
    }

    public boolean offer(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            end = node;
            size++;
            return true;
        }
        end.prev = node;
        node.next = end;
        end = node;
        size++;
        return true;
    }
    public Node<T> pool() {  // удаляет голову и возвращает удаленное значение
        if (head != null) {
            Node<T> currHead = head;
            head = head.next;
            return head;
        }
        return null;
    }
    public Node<T> remove() {
        Node<T> curE = head;
        head = head.prev;
        size--;
        return curE;
    }
    public void clear () {
        head = null;
        end = null;
        size = 0;
    }
    public void print () {
        String str = "";
        Node<T> cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = head.prev;
        }
    }
}
