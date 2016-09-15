package M5.Task7;

import java.util.Date;

/**
 * Created by asevruk on 9/13/2016.
 */
public class TripAdvisorAPI implements API {

    static Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(6, 100, 1, new Date(10, 10, 10), "a", "Kiev");
        rooms[1] = new Room(2, 300, 2, new Date(11, 10, 10), "aa", "Lvov");
        rooms[2] = new Room(3, 500, 3, new Date(12, 10, 10), "aa", "BilaCerkva");
        rooms[3] = new Room(4, 600, 2, new Date(10, 10, 10), "aa", "Zhitomir");
        rooms[4] = new Room(7, 1001, 1, new Date(11, 10, 10), "a", "Kiev");
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
