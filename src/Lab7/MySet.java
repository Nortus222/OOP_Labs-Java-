/*

MySet.java

MySet class

Created by Ihor Sherstiuk on 06/05/20.

Copyright © 2020 Ihor Sherstiuk. All rights reserved.

 */
package Lab7;

import Lab6.Toy;


import java.lang.reflect.Array;
import java.util.*;

/**
 * Class that creates MySet and implements Set
 */
public class MySet implements Set<Toy> {
    private Node head;
    private Node tail;
    private int size;

    public MySet(){

    }

    public MySet(Toy toy){
        add(toy);
    }

    public MySet(Collection<? extends Toy> collection){
        addAll(collection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for(Toy toy: this){
            if(toy.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Toy> iterator() {
        return new Iterator<Toy>() {
            private Node curNode = head;

            @Override
            public boolean hasNext() {
                return curNode != null;
            }

            @Override
            public Toy next() {
                Toy toy = curNode.getToy();
                curNode = curNode.getNext();
                return toy;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int count = 0;
        for (Toy toy: this) {
            array[count] = toy;
            count++;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a == null){
            throw new NullPointerException();
        }

        if (!a.getClass().getComponentType().isAssignableFrom(head.getToy().getClass())){
            throw new ArrayStoreException();
        }

        if (a.length == size){
            int count = 0;
            for (Toy toy: this) {
                a[count] = (T) toy;
                count++;
            }
        }else{
            a = (T[])Array.newInstance(a.getClass().getComponentType(),size);
            int count = 0;
            for (Toy toy: this) {
                a[count] = (T) toy;
                count++;
            }

        }
        return a;
    }

    @Override
    public boolean add(Toy toy) {
        if (toy == null) throw new NullPointerException();
        Node node = new Node(toy,null);
        if (head == null){
            head = node;
        }else{
            if (!this.contains(node.getToy())){
                tail.setNext(node);
            }else{
                return false;
            }
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null){
            throw  new NullPointerException();
        }
        if (head.getToy().getClass() != o.getClass()){
            throw new ClassCastException();
        }
        Toy toy = (Toy) o;
        if(!contains(toy)) return false;
        Node curNode = head;
        for(int i=0;i<size;i++){
            if(i==0 && curNode.getToy().equals(toy)){
                head = curNode.getNext();
                curNode.setNext(null);
                size--;
                return true;
            }else if(curNode.getNext().getToy().equals(toy) && curNode.getNext() != tail){
                curNode.setNext(curNode.getNext().getNext());
                size--;
                return true;
            }else if(curNode.getNext().getToy().equals(toy) && curNode.getNext() == tail){
                curNode.setNext(null);
                tail = curNode;
                size--;
                return true;
            }
            curNode = curNode.getNext();
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object toy:c) {
            if(!contains(toy))return false;
        }
        return  true;
    }

    @Override
    public boolean addAll(Collection<? extends Toy> c) {
        if (c == null){
            throw new NullPointerException();
        }
        boolean isCollectionChanged = false;
        for (Toy toy : c) {
            isCollectionChanged |= add(toy);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean isCollectionChanged = false;
        for (Toy toy: this) {
            if(!c.contains(toy)){
                remove(toy);
                isCollectionChanged = true;
            }
        }
        return isCollectionChanged;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean isCollectionChanged = false;
        for (Toy toy: this) {
            if(c.contains(toy)){
                remove(toy);
                isCollectionChanged = true;
            }
        }
        return isCollectionChanged;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
