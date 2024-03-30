package tests.src;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Node;
import src.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private Queue<Integer> instance;

    @BeforeEach
    void startUp() {
        instance  = new Queue<>();
    }

    @Test
    void offer() {
        System.out.println("offer");
        instance.offer( -17 );
        Node<Integer> node = new Node<Integer>(-17);
        int data = ((Node<Integer>) node).data;
        assertEquals( instance.peek().data, data );
    }

    @Test
    void peek() {
        System.out.println("peek");
        instance.offer( 1 );
        instance.offer( 2 );
        instance.offer( 3 );
        Node<Integer> node = new Node<Integer>(1);
        int data = ((Node<Integer>) node).data;
        assertEquals( data, instance.peek().data );
    }

    @Test
    void element() {
        System.out.println("element");
        instance.offer( 3 );
        instance.offer( 2 );
        instance.offer( 1 );
        Node<Integer> node = new Node<Integer>(3);
        int data = ((Node<Integer>) node).data;
        assertEquals( data, instance.element().data );
    }

    @Test
    void remove() {
        System.out.println("remove");
        instance.offer( 1 );
        instance.offer( 2 );
        instance.offer( 3 );
        Node<Integer> node = new Node<Integer>(1);
        int data = ((Node<Integer>) node).data;

        assertEquals( data, instance.remove().data );
    }

    @Test
    void clear() {
        System.out.println("clear");
        instance.offer(1);
        instance.clear();
        assertEquals( null, instance.peek() );
    }
}