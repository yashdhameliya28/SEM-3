
public class Question71 {
    public static void main(String[] args) {

    }
}

class Node{
    int info;
    Node link;
    Node(int info){
        this.info = info;
        this.link = null;
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
}


