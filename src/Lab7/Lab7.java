package Lab7;

import Lab6.Toy;

import java.util.ArrayList;
import java.util.Iterator;

public class Lab7 {
    public static void main(String[] args) {
        MySet set1 = new MySet(new Toy(0,0));
        set1.add(new Toy(1,1));
        set1.add(new Toy(1,1));
        set1.add(new Toy(3,3));

        MySet empty = new MySet();
        //empty.add(new Toy(2,2));

        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Toy(3,3));
        arrayList.add(new Toy(4,4));
        arrayList.add(new Toy(5,5));
        arrayList.add(new Toy(7,5));
        arrayList.add(new Toy(5,5));
        arrayList.add(new Toy(6,5));
        arrayList.add(new Toy(5,5));

        MySet setarr = new MySet(arrayList);

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(new Toy(3,3));
        arrayList1.add(new Toy(4,4));
        arrayList1.add(new Toy(5,5));

        System.out.println("------------------");

        set1.addAll(arrayList1);

        System.out.println("------------------");

        if (setarr.containsAll(arrayList1)) System.out.println("Set contains arrayList1");

        System.out.println("------------------");
        iterator = setarr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------");

        System.out.println("------------------------");
        set1.retainAll(arrayList);
        System.out.println("------------------------");
        //setarr.remove(new Toy(7,5));
        System.out.println("------------------------");
        setarr.clear();
        System.out.println("------------------------");

        Object[] arr = set1.toArray();
        System.out.println(arr);


        System.out.println("done");
    }
}
