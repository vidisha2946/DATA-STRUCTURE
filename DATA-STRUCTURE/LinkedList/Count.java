class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Count {
    // Function to insert a node at the beginning of a circular linked list
    static Node push(Node last, int data) {
        if (last == null) {
            Node temp = new Node(data);
            temp.next = temp; // Note: list was empty, so we link the single node to itself
            return temp;
        }

        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
        return last;
    }

    // Function to count nodes in a given circular linked list
    static int countNodes(Node first) {
        Node temp = first;
        int result = 0;
        if (first != null) {
            do {
                temp = temp.next;
                result++;
            } while (temp != first);
        }
        return result;
    }

    public static void main(String[] args) {
        Node first = null;
        first = push(first, 12);
        first = push(first, 56);
        first = push(first, 2);
        first = push(first, 11);

        System.out.println("Number of nodes in the circular linked list: " + countNodes(first));
    }
}
