package Lab1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Lab1 {
    public static void main(String[] args) {
        double S = 0;
        int a = 1;
        int b = 2;
        int n = 5;
        int m = 5;
        final int c = 0;


        if (a > n || b > m) {

            System.out.println("Invalid range");

        } else {

            if (a <= c && c <= n || b <= 0 && 0 <= m) {

                System.out.println("Division by zero");

            } else {

                for (float i = a; i <= n; i++) {
                    for (float j = b; j <= m; j++) {
                        S += ((i / j) / (i - c));
                    }

                }
                System.out.println(S);
            }

        }


    }
}
