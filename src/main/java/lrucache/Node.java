package lrucache;

public class Node {
    Node prev;
    int value;
    int key;
    Node next;

    public Node(int key,int value) {
        this.key = key;
        this.value = value;
    }
}
