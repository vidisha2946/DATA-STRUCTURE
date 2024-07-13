class Circular {
    int data;
    Circular next;

    public Circular(int data) {
        this.data = data;
        this.next = null;
    }
}
class CircularLinkedList {
    private Circular last;

    public CircularLinkedList() {
        this.last = null;
    }

    // Method to add a node to the circular linked list
    public void addNode(int data) {
        Circular newNode = new Circular(data);
        if (last == null) {
            last = newNode;
            last.next = last;  // Pointing to itself to make it circular
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    // Method to count the number of nodes in the circular linked list
    public int countNodes() {
        if (last == null) {
            return 0;  // No nodes in the list
        }

        Circular temp = last.next;
        int count = 0;
        do {
            count++;
            temp = temp.next;
        } while (temp != last.next);

        return count;
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        System.out.println("Number of nodes in the circular linked list: " + list.countNodes());
    }
}
