public class Question73 {
    public static void main(String[] args) {
        DoublyLinkList dll1 = new DoublyLinkList();
        dll1.insertAtEnd(6);
        dll1.insertAtEnd(5);
        dll1.insertAtEnd(4);
        dll1.insertAtEnd(3);
        dll1.insertAtEnd(2);
        dll1.insertAtEnd(1);
        dll1.deleteAlterNode();
        dll1.displayNode();
    }
}

class DoublyLinkList {
    class Node {
        int data;
        Node lptr;
        Node rptr;

        Node(int data) {
            this.data = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    Node first = null;
    Node Last = null;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            Last = newNode;
        } else {
            Last.rptr = newNode;
            newNode.lptr = Last;
            Last = newNode;

        }
    }

    public void deleteAlterNode() {
        Node current = first;
        while (current != null && current.rptr != null) {
            Node linkNode = current.rptr;
            current.rptr = linkNode.rptr;
            if (linkNode.rptr != null) {
                linkNode.rptr.lptr = current;
            }
            current = current.rptr; // Move to the link node
        }
    }

    public void displayNode() {
        if (first == null) {
            System.out.println("Empty list");
        }
        Node cur = first;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.rptr;

        }

    }

}
