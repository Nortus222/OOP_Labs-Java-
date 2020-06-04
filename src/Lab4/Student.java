/*

Student.java

Class with student methods.

Created by Ihor Sherstiuk on 05/14/20.

Copyright © 2020 Ihor Sherstiuk. All rights reserved.

 */

package Lab4;

import java.util.Comparator;

/**
 * Class that stores all student information and methods
 */
public class Student {
    private float performance; /*Student's level of performance (0-100%)*/
    private int age; /* Student's age */
    private String name; /* Student's name */
    private int course; /* Student's course (1-6)*/
    private int spec; /* Student's speciality code*/
    private String univ; /*Name of Student's University*/

    public Student(String name, int age, int course, int speciality, float performance, String university){
        /* Sets initial Student's data */
        this.name = name;
        this.age = age;
        this.course = course;
        this.spec = speciality;
        this.performance = performance;
        this.univ = university;
    }

    public float getPerformance(){
        return performance;
    }

    public int getAge(){
        return age;
    }

    public void transferUniv(String newUniversity){
        /* Transfers Student to a new University */
        this.univ = newUniversity;
        System.out.println("Update completed");
    }

    public void transferSpec(int newSpeciality){
        /* Transfers Student to a new speciality */
        this.spec = newSpeciality;
        System.out.println("Update completed");
    }

    public void expulsion(){
        /* Expels Student from university */
        this.spec = 0;
        this.course = 0;
        this.performance = 0f;
        this.univ = "None";
        System.out.println("Update completed");
    }

    public void getInfo() {
        /* Prints Student's information */
        System.out.printf("Name: %s \nAge: %d \nCourse: %d \nSpeciality: %d \nPerformance: %.2f \nUniversity: %s \n\n",
                name, age, course, spec, performance, univ);
    }

}

