package Task8.Task1;

/**
 * Created by asevruk on 10/18/2016.
 */
public class Main {
    public static void main(String[] args) {
        User u1 = new User(1,"a","b",1,1);
        User u2 = new User(1,"a","b",1,1);
        User u3 = new User(2,"a","b",1,1);
        User u4 = new User(2,"a","b",1,1);

        Order o1 = new Order(1,1,"asd","ads",u1);
        Order o2 = new Order(1,1,"asd","ads",u2);
        Order o3 = new Order(1,1,"asd","ads",u3);
        Order o4 = new Order(1,1,"asd","ads",u4);

        AbstractDAOImp<User> db = new AbstractDAOImp<User>();
        db.save(u1);
        db.save(u2);
        db.delete(u2);
        db.delete(u1);

        System.out.println(db.getList());

        AbstractDAOImp<Order> db2 = new AbstractDAOImp<Order>();
        db2.save(o1);
        db2.save(o2);
        System.out.println(db2.getList());
    }


}
