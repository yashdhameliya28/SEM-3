import java.util.*;

public class Question63 {

    public static Node copyList(Node First) {
        if (First == null) {
            return null;
        }
        Node newNode = new Node(First.info);
        Node save = First;
        Node pred = newNode;
        while (save.link != null) {
            pred.link = new Node((save.link).info);
            pred = newNode.link;
            save = save.link;
        }
        return newNode;
    }

    public static void printList(Node First) {
        Node save = First;
        while (save.link != null) {
            System.out.println(save.info);
            save = save.link;
        }
    }

    public static void main(String[] args) {
        Node First = new Node(1);
        First.link = new Node(2);
        First.link.link = new Node(3);
        System.out.println("original list");
        printList(First);
        Node newList = copyList(First);
        System.out.println("copied list");
        printList(newList);

    }
}

class Node {
    int info;
    Node link;

    Node(int info) {
        this.info = info;
        this.link = null;
    }
}
