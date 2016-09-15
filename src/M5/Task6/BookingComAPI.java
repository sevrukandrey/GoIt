package M5.Task6;

import java.util.Date;

/**
 * Created by asevruk on 9/13/2016.
 */
public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(1, 100, 1, new Date(111, 10, 10), "a", "Kiev");
        rooms[1] = new Room(2, 100, 1, new Date(222, 10, 10), "a", "Kiev");
        rooms[2] = new Room(31, 1010, 1, new Date(333, 10, 10), "a", "Kiev");
        rooms[3] = new Room(3, 100, 1, new Date(4000, 10, 10), "a", "Kiev");
        rooms[4] = new Room(4, 100, 1, new Date(5000, 10, 10), "a", "Kiev");
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
