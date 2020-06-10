package Lab6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null){
            throw new NullPointerException();
        }
        if (getClass() != o.getClass()){
            throw new ClassCastException();
        }
        Toy toy = (Toy) o;
        return Float.compare(toy.weariness, weariness) == 0 && toy.getPrice() == this.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(weariness);
    }
}
