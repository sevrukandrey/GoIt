package Task7.Task4;

import java.util.Set;

/**
 * Created by asevruk on 9/13/2016.
 */
public interface API {
    Set<Room> findRooms(int price, int persons, String city, String hotel);
    Set<Room> getAll();
}
