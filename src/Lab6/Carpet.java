package Lab6;

public class Carpet extends Furniture {

    private int sqSize;

    public Carpet(int price, float weariness, int sqSize){
        super(price, weariness);
        this.sqSize = sqSize;
    }
}
