package Lab2;

import java.util.Random;


public class Matrix {
    int a;
    int b;
    int [][] B;

    public Matrix(int a, int b){
        this.a = a;
        this.b = b;
        this.B = new int[this.a][this.b];
    }
    public void create(){

        Random tmp = new Random();
        for(int i = 0; i < a; i++ ){
            for(int j = 0; j < b; j++){
                B[i][j] = (char)tmp.nextInt(100);
            }
        }

    }


    public void output(){
        for(int i = 0; i < a; i++ ){
            for(int j = 0; j< b; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }



    public void transplonate(){
        if(a == b){
            System.out.println();
            System.out.println("Транспонована матриця: ");
            System.out.println();
            for(int i = 0; i < a; i++ ){
                for(int j = 0; j< b; j++){
                    System.out.print(B[j][i] + " ");
                }
                System.out.println();
            }
        }else{
            int [][] B1 = new int[b][a];

            for(int i = 0; i < b; i++ ){
                for(int j = 0; j < a; j++){
                    B1[i][j] = B[j][i];
                }
            }
            System.out.println();
            System.out.println("Транспонована матриця: ");
            System.out.println();

            for(int i = 0; i < b; i++ ){
                for(int j = 0; j< a; j++){
                    System.out.print(B1[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public void sumMAx(){
        int max ;
        int sum = 0;

        for(int i = 0; i < b; i++){
            max = 0;
            for(int j = 0; j < a; j++){
                if(B[j][i] > max){
                    max = B[j][i];
                }
            }
            sum += max;
        }
        System.out.println();
        System.out.println("Сума найбільших елементів кожного стовпця матриці = " + sum);
    }

}
