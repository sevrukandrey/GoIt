package Task8.Task1;

import java.util.List;

/**
 * Created by asevruk on 10/18/2016.
 */
public interface AbstractDAO <T> {
    void save(T t);
    void delete(T t);
    void deleteAll(List T);
    void saveAll(List T);
    List <T> getList();

}
