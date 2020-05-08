package Lab3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String {

    private StringBuffer str;
    private Pattern pattern;

    public String(StringBuffer str){
        this.str = new StringBuffer(str);
    }

    public void replace(StringBuffer st2, int size){
        pattern = Pattern.compile("[a-zA-Zа-яА-Я]{4}");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.replaceAll(st2.toString()));


    }

}
