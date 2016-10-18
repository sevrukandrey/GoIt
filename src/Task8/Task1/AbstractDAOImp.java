package Task8.Task1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by asevruk on 10/18/2016.
 */
public class AbstractDAOImp <T> implements AbstractDAO <T> {


    List <T> db = new LinkedList<>();

    @Override
    public void save(T t) {
        db.add(t);
    }

    @Override
    public void delete(T t) {
        db.remove(t);

    }

    @Override
    public void deleteAll(List T) {
        db.removeAll(T);

    }

    @Override
    public void saveAll(List T) {
    db.addAll(T);
    }

    @Override
    public List<T> getList() {

        return db;
    }
}
