package Task7.Task4;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by asevruk on 9/13/2016.
 */
public class Controller {


    List<API> apis = new ArrayList<>();

    public Controller() {
        apis.add(new BookingComAPI()) ;
        apis.add(new GoogleAPI()) ;
        apis.add(new TripAdvisorAPI());
    }

    List<Set<Room>> requstRooms(int price, int persons, String city, String hotel) {
        Set<API> res = new HashSet<>();
        List<Set<Room>> result = new ArrayList<>();


        for (API room : apis){
      result.add(room.findRooms(price, persons, city, hotel));
        }

        System.out.println(result);
        return result;

    }
/*

    Room[] check(API api1, API api2) {
        Set<Room> res123 = new HashSet<Room>();
        List<Room> das = new ArrayList<>();
        das.

        res123.add((Room) api1.getAll());
        res123.add((Room) api2.getAll());
        res123.


        int index2 = 0;
        Room[] finalResult = new Room[index];
        for (int i = 0; i < res1.length; i++) {
            for (int j = 0; j < res2.length; j++) {
                if (res1[i].equals(res2[j])) {
                    finalResult[index2] = res1[i];
                    index2++;
                }
            }

        }
        return finalResult;

    }
*/
}
