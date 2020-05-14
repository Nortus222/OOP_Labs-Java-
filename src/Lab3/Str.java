package Lab3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str {

    private StringBuffer str;

    public Str(String str){
        this.str = new StringBuffer(str);
    }

    public void replace(StringBuffer st2, int size){
        Pattern pattern = Pattern.compile("\\b(\\w){" + size + "}\\b", 'i');
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.replaceAll(st2.toString()));

    }

}
