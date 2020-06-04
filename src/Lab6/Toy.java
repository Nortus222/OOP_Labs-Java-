package Lab6;

public class Toy extends RoomEquipment {

    private float weariness;
    
    public Toy(int price, float weariness){
        super(price);
        this.weariness = weariness;
    }

    @Override
    public float getWeariness(){
        return weariness;
    }

    @Override
    public String toString(){
        return "\nToy: " + getClass().getSimpleName() + "\nprice: " + getPrice() + "\nweariness: "
                + getWeariness() + "\n";
    }

}
