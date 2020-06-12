package Lab8;

import Lab6.RoomEquipment;
import Lab6.Toy;
import Lab7.MySet;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;


import static org.junit.Assert.*;

public class MySetTest {
    private MySet set;

    @Before
    public void before(){
        set = new MySet();
    }

    @Test
    public void isEmptyTest(){
        boolean expected = true;
        boolean actual = set.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        set.add(new Toy(100,100));
        boolean expected = true;
        boolean actual = set.contains(new Toy(100,100));
        assertEquals(expected, actual);
    }

    @Test(expected = ClassCastException.class)
    public void containsClassCastExceptionTest(){
        set.add(new Toy(100,100));
        set.contains(new String("Toy"));
    }

    @Test(expected = NullPointerException.class)
    public void containsNullPointerExceptionTest(){
        set.add(new Toy(100,100));
        set.contains(null);
    }

    @Test
    public void toArrayObjTest(){
        set.add(new Toy(100,100));
        set.add(new Toy(200,200));
        Object[] expected = new Object[]{new Toy(100,100), new Toy(200,200)};
        Object[] actual = set.toArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void toArrayTest(){
        set.add(new Toy(100,100));
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
        set.add(new Toy(100,100));
        set.add(new Toy(200,200));
        String[] str = set.toArray(new String[0]);
    }

    @Test(expected = NullPointerException.class)
    public void toArrayNullPointerExceptionTest(){
        set.add(new Toy(100,100));
        set.add(new Toy(200,200));
        set.toArray(null);
    }

    @Test
    public void addTest(){
        set.add(new Toy(200,200));
        Iterator iterator = set.iterator();
        Toy expected = new Toy(200,200);
        Object actual = iterator.next();
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void addNullPointerExceptionTest(){
        set.add(null);
    }

    @Test(expected = NullPointerException.class)
    public void removeTest(){
        set.add(new Toy(200,200));
        set.remove(new Toy(200,200));
        Iterator iterator = set.iterator();
        iterator.next();
    }

    @Test(expected = NullPointerException.class)
    public void removeNullPointerExceptionTest(){
        set.add(new Toy(200,200));
        set.remove(null);
    }

    @Test
    public void containsAllTest(){
        set.add(new Toy(200,200));
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
        set.add(new Toy(200,200));
        set.containsAll(null);
    }

    @Test(expected = ClassCastException.class)
    public void containsAllClassCastExceptionTest(){
        set.add(new Toy(200,200));
        set.add(new Toy(100,100));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new String("Toy1"));
        arrayList.add(new String("Toy2"));
        set.containsAll(arrayList);
    }

    @Test
    public void addAllTest(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Toy(100,100));
        arrayList.add(new Toy(200,200));
        set.addAll(arrayList);
        Object[] expected = arrayList.toArray();
        Object[] actual = set.toArray();
        assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void addAllNullPointerExceptionTest(){
        set.addAll(null);
    }

    @Test
    public void retainAllTest(){
        set.add(new Toy(100,100));
        set.add(new Toy(200,200));
        set.add(new Toy(300,300));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Toy(100,100));
        arrayList.add(new Toy(200,200));
        arrayList.add(new Toy(500,500));
        set.retainAll(arrayList);
        arrayList.remove(new Toy(500,500));
        Object[] expected = arrayList.toArray();
        Object[] actual = set.toArray();
        assertArrayEquals(expected, actual);
    }

    @Test(expected = ClassCastException.class)
    public void retainAllClassCastExceptionTest(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(new String("Toy"));
        set.add(new Toy(100,100));
        set.retainAll(arrayList);
    }

    @Test(expected = NullPointerException.class)
    public void retainAllNullPointerExceptionTest(){
        set.add(new Toy(100,100));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        set.retainAll(arrayList);
    }

    @Test
    public void removeAllTest(){
        set.add(new Toy(100,100));
        set.add(new Toy(200,200));
        set.add(new Toy(300,300));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Toy(100,100));
        arrayList.add(new Toy(200,200));
        arrayList.add(new Toy(500,500));
        set.removeAll(arrayList);
        Object[] expected = new Object[]{new Toy(300,300)};
        Object[] actual = set.toArray();
        assertArrayEquals(expected, actual);
    }

    @Test(expected = ClassCastException.class)
    public void removeAllClassCastExceptionTest(){
        set.add(new Toy(100,100));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new String("Toy"));
        set.removeAll(arrayList);
    }

    @Test(expected = NullPointerException.class)
    public void removeAllNullPointerExceptionTest(){
        set.add(new Toy(100,100));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        set.removeAll(arrayList);
    }

    @Test
    public void clearTest(){
        set.add(new Toy(100,100));
        set.add(new Toy(200,200));
        set.add(new Toy(300,300));
        set.clear();
        boolean expected = true;
        boolean actual = set.isEmpty();
        assertEquals(expected, actual);
    }
}