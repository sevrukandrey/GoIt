package M5.Task5;

import M5.Task6.API;
import M5.Task6.Room;

import java.util.Date;

/**
 * Created by asevruk on 9/13/2016.
 */
public class GoogleAPI implements API {
    static Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(1, 100, 1, new Date(10, 10, 10), "a", "Lvol");
        rooms[1] = new Room(2, 200, 2, new Date(11, 10, 10), "a", "Lvov");
        rooms[2] = new Room(3, 300, 3, new Date(12, 10, 10), "a", "BilaCerkva");
        rooms[3] = new Room(4, 200, 2, new Date(10, 10, 10), "a", "Zhitomir");
        rooms[4] = new Room(5, 300, 1, new Date(11, 10, 10), "a", "Dnepr");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] mas = new Room[10];
        for (int i = 0; i < rooms.length; i++) {
            if (price == rooms[i].getPrice() && persons == rooms[i].getPersons() && city == rooms[i].getCityName() && hotel == rooms[i].getHotelName()) {
                mas[i] = rooms[i];
            }

        }
        return mas;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
