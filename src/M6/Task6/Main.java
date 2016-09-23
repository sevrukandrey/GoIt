package M6.Task6;

/**
 * Created by asevruk on 9/22/2016.
 */
public class Main {
    public static void main(String[] args) {
        User u1 = new User(1,"a","b",1000,1000);
        User u2 = new User(11,"a","b",1000,1000);
        User u3 = new User(12,"a","b",1000,1000);
        User u4 = new User(112,"a12","b1",11000,1000);
        User [] users = {u1,u2,u3,u4,null};

        System.out.println("usersWithContitionalBalance");
        UserUtils.usersWithContitionalBalance(users, 1000);
        System.out.println("////////////////////////////////");
        System.out.println("Delete Empty");
        UserUtils.deleteEmptyUsers(users);
        System.out.println("////////////////////////////////");
        System.out.println("All users ID");
        UserUtils.getUsersId(users);
        System.out.println("////////////////////////////////");
        System.out.println("PaySalary");
        UserUtils.paySalaryToUsers(users);
        System.out.println("////////////////////////////////");
        System.out.println("uniqueUsers");
        UserUtils.uniqueUsers(users);
        System.out.println("////////////////////////////////");

    }

}
