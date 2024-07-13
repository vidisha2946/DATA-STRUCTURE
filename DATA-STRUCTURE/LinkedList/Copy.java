class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
public class Copy {
    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node Temp = current.next;
            current.next = prev;
            prev = current;
            current = Temp;
        }
        return prev;
    }
}
