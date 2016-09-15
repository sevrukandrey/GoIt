package M5.Task6;

import java.util.Date;

/**
 * Created by asevruk on 9/13/2016.
 */
public class GoogleAPI implements API {
    static Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(5, 100, 1, new Date(10, 10, 10), "a", "Kiev");
        rooms[1] = new Room(212, 200, 2, new Date(11, 10, 10), "a", "Lvov");
        rooms[2] = new Room(312, 300, 3, new Date(12, 10, 10), "a", "BilaCerkva");
        rooms[3] = new Room(412, 200, 2, new Date(10, 10, 10), "a", "Zhitomir");
        rooms[4] = new Room(533, 300, 1, new Date(11, 10, 10), "a", "Dnepr");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        int count = 0;
        int res = 0;


        for (int i = 0; i < rooms.length; i++) {
            if (price == rooms[i].getPrice() && persons == rooms[i].getPersons() && city == rooms[i].getCityName() && hotel == rooms[i].getHotelName()) {
                count++;
            }
        }

        Room[] result = new Room[count];

        for (int i = 0; i < rooms.length; i++) {

            if (price == rooms[i].getPrice() && persons == rooms[i].getPersons() && city == rooms[i].getCityName() && hotel == rooms[i].getHotelName() && rooms[i] != null) {
                result[res] = rooms[i];
                res++;
            }
        }

        return result;

    }
    @Override
    public Room[] getAll() {
        return rooms;
    }
}
