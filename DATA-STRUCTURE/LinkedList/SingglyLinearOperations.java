import java.util.Scanner;
class LinkedList{
    class Node {
        int data;
        Node link;
    }

    Node first;

    /********** for insert at first in list ****************/

    void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.link = first;
        first = newNode;
    }

    /********** for insert at last in list ****************/

    void insertEnd(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.link = null;
        Node temp = first;
        while (temp.link != null){
            temp = temp.link; 
        }
        temp.link = newNode;
    }

    /********** for insert in order list ****************/

    void insertOrder(int data){
        Node newNode = new Node();
        newNode.data = data;
        Node save = first;
        if (first == null || first.data >= newNode.data) {
            newNode.link = first;
            first = newNode;
        } else {
            while (save.link != null && save.link.data <= newNode.data) {
                save = save.link;
            }
            newNode.link = save.link;
            save.link = newNode;
        }
    }

    /********** for display a list ****************/

    void displayList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }

    /********** Delete first element ****************/

    void DeleteFirst() {
        first = first.link;
    }

    /********** Delete last element ****************/

    void DeleteLast() {
        Node pred = first;
        while (pred.link.link != null) {
            pred = pred.link;
        }
        pred.link = null;
    }

    /********** Delete specified element ****************/

    void Deletespecified(int index){
        //linked first is empty
        if(first==null)
        {
            System.out.println("empty");
            return;
        }
        Node temp = first;
        Node pre = null;
        //first node hholds the data
        if(temp.data==index){
            first=temp.link;
            return;
        }
        //search for the index to be deleted 
        //revios node as we need  to change temp.link
        while(temp!=null && temp.data != index){
            pre = temp;
            temp = temp.link;
        }
        //if key was not present in linked list
        if(temp==null){
            System.out.println("node not found");
            return;
        }
        //unlink the node from linked list
        pre.link = temp.link;
    }
}

public class SingglyLinearOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList ll = new LinkedList();
        boolean ans = true;
        while (ans) {
            System.out.println("1. Insert at first");
            System.out.println("2. Insert at last");
            System.out.println("3. Insert in order");
            System.out.println("4. Display");
            System.out.println("5. Delete at first");
            System.out.println("6. Delete at last");
            System.out.println("7. Delete at given position");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to insert:");
                    int a = sc.nextInt();
                    ll.insertFirst(a);
                    break;

                case 2:
                    System.out.println("Enter the element you want to insert:");
                    int b = sc.nextInt();
                    ll.insertEnd(b);
                    break;

                case 3:
                    System.out.println("Enter the element you want to insert:");
                    int c = sc.nextInt();
                    ll.insertOrder(c);
                    break;

                case 4:
                    ll.displayList();
                    break;

                case 5:
                    ll.DeleteFirst();
                    break;

                case 6:
                    ll.DeleteLast();
                    break;

                case 7:
                    System.out.println("Enter the element you want to delete:");
                    int d = sc.nextInt();
                    ll.Deletespecified(d);
                    break;

                case 8:
                    ans = false;
                    break;
            }
        }
        sc.close();
    }
}

