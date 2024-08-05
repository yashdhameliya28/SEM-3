import java.util.*;

public class Question71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circularLinkedList crl1 = new circularLinkedList();
        while (true) {
            System.out.println("Enter 1 to insert a node at first");
            System.out.println("Enter 2 to insert a node at last");
            System.out.println("Enter 3 to delete a node at given position");
            System.out.println("Enter 4 to display all node");
            System.out.println("Enter 5 to exit");
            int c = sc.nextInt();
            int data;
            if (c == 1) {
                System.out.println("Enter a value of node info");
                data = sc.nextInt();
                crl1.insertAtFirst(data);
            } else if (c == 2) {
                System.out.println("Enter a value of node info");
                data = sc.nextInt();
                crl1.insertAtLast(data);
            } else if (c == 3) {
                System.out.println("Enter a position");
                int n = sc.nextInt();
                crl1.deleteAtPosoition(n);
            } else if (c == 4) {
                crl1.displayNode();
            } else if (c == 5) {
                break;
            }
        }
    }
}

class circularLinkedList {
    class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node First = null;
    Node Last = First;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (First == null) {
            newNode.link = newNode;
            First = newNode;
            Last = newNode;
            return;
        } else {
            newNode.link = First;
            Last.link = newNode;
            First = newNode;
        }
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (First == null) {
            First = newNode;
            Last = newNode;
        } else {
            Node save = First;
            while (save.link != null) {
                save = save.link;
            }
            save.link = newNode;
            newNode.link = First;
            Last = newNode;
        }
    }

    static int noOfNode = 1;

    public void displayNode() {
        Node save = First;
        while (save.link != First) {
            noOfNode++;
            System.out.println(save.info);
            save = save.link;
        }
    }

    public void deleteAtPosoition(int n) {
        int count = 1;
        if (First == null) {
            System.out.println("underflow");
            return;
        }
        Node save = First;
        Node pred = First;
        while (count != n) {
            pred = save;
            save = save.link;
            count++;
        }
        if (count == 1) {
            First = First.link;
            Last.link = First;
        } else if (count == noOfNode) {
            pred.link = save.link;
            Last = pred;
        } else {
            pred.link = save.link;
        }
    }

}
