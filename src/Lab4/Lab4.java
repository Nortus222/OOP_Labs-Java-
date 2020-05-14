/*

Lab4.java

Main class

Created by Ihor Sherstiuk on 05/14/20.

Copyright © 2020 Ihor Sherstiuk. All rights reserved.

 */

package Lab4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Class that creates a list of Students and performs operations
 */
public class Lab4 {
    public static void main(String[] args) {

        String[] names = {"Ivan", "Alex", "Petro", "Dima", "Denis"};

        Student[] students = new Student[5];
        Random tmp = new Random();


        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i],
                    tmp.nextInt((27 - 17) + 1) + 17,
                    tmp.nextInt((6 - 1) + 1) + 1,
                    tmp.nextInt((126 - 121) + 1) + 121,
                    1f + tmp.nextFloat() * (100f - 1f),
                    "KPI");
            students[i].getInfo();
        }

        Arrays.sort(students, new SortByAge());
        System.out.println("-------Sorted-------------------By Age---------(Up)");
        for (int i = 0; i < students.length; i++) {
            students[i].getInfo();
        }

        Arrays.sort(students, new SortByPerformance());
        System.out.println("-------Sorted-------------------By Performance---------(Down)");
        for (int i = 0; i < students.length; i++) {
            students[i].getInfo();
        }
    }
}

/**
 * Class for comparing age of two students
 */
class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.age - b.age;
    }
}

/**
 * Class for comparing a performance of two students
 */
class SortByPerformance implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (b.performance < a.performance)
            return -1;
        if (b.performance > a.performance)
            return 1;
        return 0;
    }
}