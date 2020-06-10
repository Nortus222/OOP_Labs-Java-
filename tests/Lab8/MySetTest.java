package Lab8;

import Lab6.RoomEquipment;
import Lab6.Toy;
import Lab7.MySet;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;


import static org.junit.Assert.*;

public class MySetTest {

    @Test
    public void isEmptyTest(){
        MySet set = new MySet();
        int expected = 0;
        int actual = set.size();
        assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        MySet set = new MySet(new Toy(100,100));
        boolean expected = true;
        boolean actual = set.contains(new Toy(100,100));
        assertEquals(expected, actual);
    }

    @Test(expected = ClassCastException.class)
    public void containsClassCastExceptionTest(){
        MySet set = new MySet(new Toy(100,100));
        set.contains(new String("Toy"));
    }

    @Test(expected = NullPointerException.class)
    public void containsNullPointerExceptionTest(){
        MySet set = new MySet(new Toy(100,100));
        set.contains(null);
    }

    @Test
    public void toArrayObjTest(){
        MySet set = new MySet(new Toy(100,100));
        set.add(new Toy(200,200));
        Object[] expected = new Object[]{new Toy(100,100), new Toy(200,200)};
        Object[] actual = set.toArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void toArrayTest(){
        MySet set = new MySet(new Toy(100,100));
        set.add(new Toy(200,200));
        RoomEquipment[] expected = new RoomEquipment[]{new Toy(100,100), new Toy(200,200)};
        RoomEquipment[] actual = set.toArray(new RoomEquipment[10]);
        RoomEquipment[] actual2 = set.toArray(new RoomEquipment[0]);
        RoomEquipment[] actual3 = set.toArray(new RoomEquipment[2]);
        assertArrayEquals(expected, actual);
        assertArrayEquals(expected, actual2);
        assertArrayEquals(expected, actual3);
    }

    @Test(expected = ArrayStoreException.class)
    public void toArrayArrayStoreExceptionTest(){
        MySet set = new MySet(new Toy(100,100));
        set.add(new Toy(200,200));
        String[] str = set.toArray(new String[0]);
    }

    @Test(expected = NullPointerException.class)
    public void toArrayNullPointerExceptionTest(){
        MySet set = new MySet(new Toy(100,100));
        set.add(new Toy(200,200));
        set.toArray(null);
    }

    @Test
    public void addTest(){
        MySet set = new MySet();
        set.add(new Toy(200,200));
        Iterator iterator = set.iterator();
        Toy expected = new Toy(200,200);
        Object actual = iterator.next();
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void addNullPointerExceptionTest(){
        MySet set = new MySet();
        set.add(null);
    }

    @Test(expected = NullPointerException.class)
    public void removeTest(){
        MySet set = new MySet(new Toy(200,200));
        set.remove(new Toy(200,200));
        Iterator iterator = set.iterator();
        iterator.next();
    }

    @Test(expected = NullPointerException.class)
    public void removeNullPointerExceptionTest(){
        MySet set = new MySet(new Toy(200,200));
        set.remove(null);
    }

    @Test
    public void containsAllTest(){
        MySet set = new MySet(new Toy(200,200));
        set.add(new Toy(100,100));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Toy(100,100));
        arrayList.add(new Toy(200,200));
        boolean expected = true;
        boolean actual = set.containsAll(arrayList);
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void containsAllNullPointerExceptionTest(){
        MySet set = new MySet(new Toy(200,200));
        set.containsAll(null);
    }

    @Test(expected = ClassCastException.class)
    public void containsAllClassCastExceptionTest(){
        MySet set = new MySet(new Toy(200,200));
        set.add(new Toy(100,100));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new String("Toy1"));
        arrayList.add(new String("Toy2"));
        set.containsAll(arrayList);
    }







}