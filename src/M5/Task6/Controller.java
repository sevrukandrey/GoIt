package M5.Task6;

/**
 * Created by asevruk on 9/13/2016.
 */
public class Controller {
    API[] apis = new API[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {

        Room[] r = apis[0].findRooms(price, persons, city, hotel);
        Room[] r1 = apis[1].findRooms(price, persons, city, hotel);
        Room[] r2 = apis[2].findRooms(price, persons, city, hotel);

        Room[] res = new Room[r.length + r1.length + r2.length];
        int index = 0;
        for (int i = 0; i < r.length; i++) {
            res[index] = r[i];
            index++;
        }
        for (int i = 0; i < r1.length; i++) {
            res[index] = r1[i];
            index++;
        }
        for (int i = 0; i < r2.length; i++) {
            res[index] = r2[i];
            index++;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        DAOimpl dao = new DAOimpl();
        for (int i = 0; i <res.length ; i++) {
            dao.save(res[i]);

        }

        return res;
    }


    Room[] check(API api1, API api2) {
        Room[] res1 = api1.getAll();
        Room[] res2 = api2.getAll();
        int index = 0;

        for (int i = 0; i < res1.length; i++) {
            for (int j = 0; j < res2.length; j++) {
                if (res1[i].equals(res2[j])) {
                    index++;
                }
            }

        }
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

}
