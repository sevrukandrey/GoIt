package M5.Task4;

import M5.Task6.API;
import M5.Task6.Room;

import java.util.Date;

/**
 * Created by asevruk on 9/13/2016.
 */
public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0]=new Room(1,100,1,new Date(10,10,10),"a","Kiev");
        rooms[1]=new Room(2,100,2,new Date(11,10,10),"a","Lvov");
        rooms[2]=new Room(3,100,3,new Date(12,10,10),"a","BilaCerkva");
        rooms[3]=new Room(4,100,2,new Date(10,10,10),"a","Zhitomir");
        rooms[4]=new Room(5,100,1,new Date(11,10,10),"a","Dnepr");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }



}
