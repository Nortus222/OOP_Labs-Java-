package Lab2;

import java.util.Random;


public class Matrix {
   private int a;
   private int b;
   private int[][] B;
   private int[][] B1;

    public Matrix(int a, int b) {
        this.a = a;
        this.b = b;
        this.B = new int[this.a][this.b];
        this.create();
        this.output(this.B, this.a, this.b);
    }


    public void create() {
        Random tmp = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                B[i][j] = (char) tmp.nextInt(100);
            }
        }

    }


    public void output(int[][] m, int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%3d", m[i][j]);
            }
            System.out.println();
        }
    }


    public void transplonate() {
        if (a == b) {
            System.out.println();
            System.out.println("Транспонована матриця: ");
            System.out.println();
            for (int i = 0; i < a; i++) {
                for (int j = i + 1; j < b; j++) {
                    int tmp = B[i][j] ;
                    B[i][j] = B[j][i];
                    B[j][i] = tmp;
                }
            }
            System.out.println();
            this.output(B, a, b);
        } else {
            B1 = new int[b][a];

            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    B1[i][j] = B[j][i];
                }
            }
            System.out.println();
            System.out.println("Транспонована матриця: ");
            System.out.println();
            this.output(B1, b, a);
        }
    }


    public void sumMax() {
        int max;
        int sum = 0;
        if(a==b) {
            for (int i = 0; i < b; i++) {
                max = B[0][i];
                for (int j = 1; j < a; j++) {
                    if (B[j][i] > max) {
                        max = B[j][i];
                    }
                }
                sum += max;
            }
        }else{
            for (int i = 0; i < a; i++) {
                max = B1[0][i];
                for (int j = 1; j < b; j++) {
                    if (B1[j][i] > max) {
                        max = B1[j][i];
                    }
                }
                sum += max;
            }

        }
        System.out.println();
        System.out.println("Сума найбільших елементів кожного стовпця матриці = " + sum);
    }

}
