package M5.Task4;

import M5.Task6.API;
import M5.Task6.Room;

import java.util.Date;

/**
 * Created by asevruk on 9/13/2016.
 */
public class TripAdvisorAPI implements API {
    static Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(1, 150, 1, new Date(10, 10, 10), "c", "Lvol");
        rooms[1] = new Room(2, 300, 2, new Date(11, 10, 10), "aa", "Lvov");
        rooms[2] = new Room(3, 500, 3, new Date(12, 10, 10), "aa", "BilaCerkva");
        rooms[3] = new Room(4, 600, 2, new Date(10, 10, 10), "aa", "Zhitomir");
        rooms[4] = new Room(5, 1000, 1, new Date(11, 10, 10), "a", "Dnepr");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
    return null;
    }

    @Override
    public Room[] getAll() {
        return null;
    }



}
