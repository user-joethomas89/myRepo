package LinkedList;

/**
 * Created by jthomas on 4/9/17.
 */
public class RemoveDups {
    static class Node {
        int data;
        Node next;
    }

    Node head = null;

    public static void main(String[] args) {

        insert(5);
        insert(4);
        insert(6);
        insert(7);

    }

    private static void insert(int data) {

        Node temp = getNewNode(data);


    }

    private static Node getNewNode(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }
}
hello there
