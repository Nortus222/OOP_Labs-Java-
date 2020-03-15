package Lab1;

public class Lab1 {
    public static void main(String[] args){
        double S = 0;
        int a = 1;
        int b = 2;
        int n = 5;
        int m = 5;
        final int c = 0;

        if(a <= c && c <= n || b <= 0 && 0 <= m){
            System.out.println("Division by zero");

        }else{

            for(float i = (float)a; i<=n; i++){
                for(float j = (float)b; j<=m; j++){
                    S+=((double)(i/j)/i);
                }

            }
            System.out.println(S);
        }






    }
}
