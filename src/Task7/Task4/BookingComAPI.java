package Task7.Task4;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by asevruk on 9/13/2016.
 */
public class BookingComAPI implements API {


    private Set<Room> rooms = new HashSet<>();

    public BookingComAPI() {
        rooms.add(new Room(1, 100, 1, new Date(111, 10, 10), "a", "Kiev"));
        rooms.add(new Room(2, 100, 1, new Date(222, 10, 10), "a", "Kiev"));

       rooms.add(new Room(31, 1010, 1, new Date(333, 10, 10), "a", "Kiev"));
        rooms.add(new Room(3, 100, 1, new Date(4000, 10, 10), "a", "Kiev"));
        rooms.add(new Room(4, 100, 1, new Date(5000, 10, 10), "a", "Kiev"));
    }

    @Override
    public Set<Room> findRooms(int price, int persons, String city, String hotel) {


       Set<Room> result = new HashSet<>();

        for (Room item : rooms ){
            if (price == item.getPrice()&& persons == item.getPersons() && city == item.getCityName() && hotel == item.getHotelName()){
                result.add(item);
            }
        }



        return result;

    }

    @Override
    public Set <Room> getAll() {
        return rooms;
    }
}
