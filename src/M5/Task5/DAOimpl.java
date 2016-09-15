package M5.Task5;
import java.util.Date;

/**
 * Created by asevruk on 9/13/2016.
 */
public class DAOimpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println(room + "saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room + "deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room + "updated");
        return  room;
    }

    @Override
    public Room findById(long id) {
        Room r =new Room(1,1,1,new Date(10,10,10),"s","s");
        System.out.println("room by id"+r);
        return r ;
    }
}
