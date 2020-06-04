package Lab5;

public class Sentence extends Element {

    private Word[] clSentence;
    private Element[] sentence;

    public Sentence(Element ... s){
        sentence = new Element[s.length];
        sentence = s;
    }

    public void replace(int size, Word wordToReplaceWith){
        for (int i=0;i<sentence.length;i++){
            if (sentence[i] instanceof Word && sentence[i].getLenth() == size){
                sentence[i] = wordToReplaceWith;
            }
        }
    }

    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();
        for(int i=0;i<sentence.length;i++){
            str.append((i!=0 && sentence[i] instanceof Word ? " " : "") + sentence[i].toString());
        }

        return str.toString();
    }

}
