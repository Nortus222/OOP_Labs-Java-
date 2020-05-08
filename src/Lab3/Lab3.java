package Lab3;

public class Lab3 {
    public static void main(String[] args) {

        int size = 4;
        StringBuffer sb = new StringBuffer("Java — обєктно-орієнтована мова програмування, випущена 1995 року компанією «Sun Microsystems» як основний компонент платформи Java");
        StringBuffer sb2 = new StringBuffer("класс");
        String str = new String(sb);

        str.replace(sb2, 4);
    }
}
