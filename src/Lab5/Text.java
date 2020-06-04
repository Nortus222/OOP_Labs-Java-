package Lab5;

public class Text {

    private Sentence[] text;

    public Text(Sentence ... t){
        text = new Sentence[t.length];
        text = t;
    }

    public void replace(int size, Word wordToReplaceWith){
        for(int i=0;i<text.length;i++){
            text[i].replace(size,wordToReplaceWith);
        }
        toString();
    }

    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();
        for (int i=0;i< text.length;i++){
            str.append(text[i].toString() + " ");
        }
        return str.toString();
    }
}
