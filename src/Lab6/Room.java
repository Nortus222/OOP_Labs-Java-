package Lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Room {

    private RoomEquipment[] roomEquipments;

    public Room(RoomEquipment[] roomEquipments){
        this.roomEquipments = roomEquipments;

    }

    public void equipRoomWithMoney(int priceLimit){
        List<RoomEquipment> equipmentList = Arrays.asList(roomEquipments);
        equipmentList.sort(Comparator.comparing(RoomEquipment::getPrice));
        List<RoomEquipment> equipmentListForMoney = new ArrayList();
        int money = 0;
        int count = 0;
        while(money + equipmentList.get(count).getPrice() <= priceLimit){
            equipmentListForMoney.add(equipmentList.get(count));
            money += equipmentList.get(count).getPrice();
            count++;
        }

        System.out.println(equipmentListForMoney);

    }

    public void sortByWeariness(){
        List<RoomEquipment> wearList = new ArrayList();
        for(RoomEquipment i: roomEquipments){
            wearList.add(i);
        }
        wearList.sort(Comparator.comparing(RoomEquipment::getWeariness));
        System.out.println(wearList);
    }

    public void getToyForMoney(int moneyDown,int moneyUp){
        List<Toy> toyForMoney = new ArrayList();
        for(RoomEquipment i: roomEquipments){
            if(i instanceof Toy && i.getPrice() >= moneyDown && i.getPrice() <= moneyUp){
                toyForMoney.add((Toy) i);
            }
        }

        toyForMoney.sort(Comparator.comparing(Toy::getPrice));
        System.out.println(toyForMoney);

    }
}
