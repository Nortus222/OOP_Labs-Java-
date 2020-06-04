package Lab6;

public class Furniture extends RoomEquipment {
    private float weariness;

    public Furniture(int price, float weariness){
        super(price);
        this.weariness = weariness;
    }

    @Override
    public float getWeariness(){
        return weariness;
    }

    @Override
    public String toString(){
        return "\nFurniture: " + getClass().getSimpleName() + "\nprice: " + getPrice() + "\nweariness: "
                + getWeariness() + "\n";
    }
}
