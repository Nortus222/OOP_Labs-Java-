package Lab5;

public class Word extends Element {

    private Letter[] word;

    public Word(Letter ... l){
        word = new Letter[l.length];
        word = l;

    }

    public Letter[] getWord(){
        return word;
    }

    @Override
    public int getLenth(){
        return word.length;
    }

    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();

        for (Letter i:word) {
            str.append(i.getLetter());
        }
        return str.toString();
    }
}
