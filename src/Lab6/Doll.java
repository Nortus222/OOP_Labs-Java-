package Lab6;

public class Doll extends Toy {
    private boolean isGirl;

    public Doll(int price, float weariness, boolean isGirl){
        super(price,weariness);
        this.isGirl = isGirl;
    }


}
