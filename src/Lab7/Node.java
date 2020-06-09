/*

Node.java

Node class

Created by Ihor Sherstiuk on 06/05/20.

Copyright © 2020 Ihor Sherstiuk. All rights reserved.

 */
package Lab7;

import Lab6.Toy;

/**
 * Class that makes realisation like linked list
 */
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
