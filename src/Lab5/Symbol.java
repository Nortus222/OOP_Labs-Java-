package Lab5;

public class Symbol extends Element {

    private char symbol;

    public Symbol(char symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        return "" + this.symbol;
    }
}
