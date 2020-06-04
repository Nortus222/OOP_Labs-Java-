package Lab6;

public class Lab6 {
    public static void main(String[] args) {

        Toy toy1 = new Ball(50,90,4);
        Toy toy2 = new Doll(200,85, true);
        Toy toy3 = new Lego(500,50.9f,2016);

        Furniture fur1 = new Table(800,100,75);
        Furniture fur2 = new Carpet(1200, 60,200);

        Room room = new Room(new RoomEquipment[]{toy1,toy2,toy3,fur1,fur2});

        System.out.println("---------Toy For Money----------------");
        room.getToyForMoney(150,300);

        System.out.println("----------Sorted by weariness---------");
        room.sortByWeariness();

        System.out.println("----------Room equipped for money-----");
        room.equipRoomWithMoney(2000);

    }
}
