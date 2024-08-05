import java.util.*;

public class Question72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkList dll1 = new DoublyLinkList();
        while (true) {
            System.out.println("Enter 1 to insert a node at the front");
            System.out.println("Enter 2 to delete a node from a specified position");
            System.out.println("Enter 3 to display all nodes");
            System.out.println("Enter 4 to exit");
            int c = sc.nextInt();
            int data;
            if (c == 1) {
                System.out.println("Enter data of node");
                data = sc.nextInt();
                dll1.insertAtFirst(data);
            } else if (c == 2) {
                System.out.println("Enter position to node delete");
                int n = sc.nextInt();
                dll1.deleteAtPosition(n);
            } else if (c == 3) {
                dll1.displayNode();
            } else if (c == 4) {
                break;
            }
        }
    }
}

class DoublyLinkList {
    class Node {
        int info;
        Node lptr;
        Node rptr;

        Node(int data) {
            this.info = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    Node first;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first != null) {
            first.lptr = newNode;
            newNode.lptr = null;
            newNode.rptr = first;
        }
        newNode.rptr = first;
        first = newNode;
    }

    public void deleteAtPosition(int n) {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node save = first;
        if (n == 1) {
            save = save.lptr;
            first = save;
            if (save != null) {
                save.lptr = null;
            }
            return;
        }
        for (int i = 1; save != null && i < n; i++) {
            save = save.rptr;
        }
        if (save == null) {
            System.out.println("Enter valid position");
            return;
        }
        if (save.rptr != null) {
            save.rptr.lptr = save.lptr;
        }
        if (save.lptr != null) {
            save.lptr.rptr = save.rptr;
        }
    }

    public void displayNode() {
        if (first == null) {
            System.out.println("List Empty");
            return;
        }
        Node save = first;
        while (save != null) {
            System.out.println(save.info);
            save = save.rptr;
        }
    }

}