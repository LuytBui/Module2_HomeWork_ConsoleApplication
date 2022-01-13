import hotel.management.HotelManager;
import hotel.management.Person;
import hotel.management.Room;

import java.util.Scanner;

public class HotelManagementTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Person person1 = new Person("Nguyễn Văn A", "14/1/1981", "1451017878");
        Person person2= new Person("Nguyễn Văn B", "1/2/1983", "12451245102");
        Person person3 = new Person("Nguyễn Văn C", "19/11/1991", "998997997996");

        Room room1 = new Room("501", "vip", 2800000, 5, person1);
        Room room2 = new Room("511", "normal", 800000, 3, person2);
        Room room3 = new Room("402", "super vip", 6200000, 10, person3);

//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
//
//        System.out.println(room1);
//        System.out.println(room2);
//        System.out.println(room3);

        HotelManager hotelManager = new HotelManager();
        hotelManager.addRoom(room1);
        hotelManager.addRoom(room2);
        hotelManager.addRoom(room3);

        System.out.println(hotelManager.roomsListToString());

        System.out.println();
        hotelManager.removeRoomById("511");
        System.out.println(hotelManager.roomsListToString());

        System.out.println();
        hotelManager.removeRoomById("111");
        System.out.println(hotelManager.roomsListToString());

        hotelManager.addRoom(hotelManager.inputRoom(scanner));
        System.out.println(hotelManager.roomsListToString());
    }

}
