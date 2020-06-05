package Lab7;

import Lab6.Toy;

import java.util.Objects;

public class Node {
    private Toy toy;
    private Node next;

    public Node(Toy toy,Node next){
        this.toy = toy;
        this.next = next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return next;
    }

    public Toy getToy(){
        return toy;
    }


}
