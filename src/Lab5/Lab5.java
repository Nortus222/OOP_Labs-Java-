package Lab5;

import javax.sound.midi.Soundbank;

public class Lab5 {
    public static void main(String[] args) {

        int size = 3;

        Letter t = new Letter('t');
        Letter e = new Letter('e');
        Letter s = new Letter('s');
        Letter a = new Letter('a');


        Symbol dot = new Symbol('.');
        Symbol coma = new Symbol(',');

        Word word1 = new Word(t,e,s,t);
        Word word2 = new Word(t,e,a);
        Word word3 = new Word(s,e,t);
        Word word4 = new Word(a,s,s,e,t,s);
        Word word5 = new Word(s,e,e);

        Word wordReplace = new Word(s,s,s,s,s,s,s);

        Sentence st1 = new Sentence(word3,word2,coma,word5,dot);
        Sentence st2 = new Sentence(word1,word4,dot);

        Text text = new Text(st1,st2);

        System.out.println(text);

        text.replace(size,wordReplace);

        System.out.println(text);

    }
}
