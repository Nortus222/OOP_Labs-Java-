package Lab6;

public class RoomEquipment {

    private int price;

    public RoomEquipment(int price){
        this.price = price;
    }

    public float getWeariness(){
        return 100f;
    }

    public int getPrice(){
        return price;
    }
}
