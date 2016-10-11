package Task7.Task4;

/**
 * Created by asevruk on 9/13/2016.
 */
public interface DAO {
    Room save(Room room);

    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
