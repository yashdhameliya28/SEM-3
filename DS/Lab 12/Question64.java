import java.util.*;

public class Question64 {

    public static Node reverseList(Node First) {
        Node save = First, prev = null, temp = null;
        while (save != null) {
            temp = save.link;
            save.link = prev;
            prev = save;
            save = temp;
        }
        return prev;
    }

    public static void printList(Node First) {
        Node save = First;
        while (save != null) {
            System.out.println(save.info);
            save = save.link;
        }
    }

    public static void main(String[] args) {
            Node First = new Node(1);
            First.link = new Node(2);
            First.link.link = new Node(3);

        System.out.println("Normal List");
        printList(First);

        System.out.println("Reverse List");
        Node reversedList = reverseList(First);
        printList(reversedList);
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
