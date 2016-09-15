package M5.Task6;

/**
 * Created by asevruk on 9/13/2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}
