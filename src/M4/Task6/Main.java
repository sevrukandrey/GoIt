package M4.Task6;

import static M4.Task6.Currency.*;

/**
 * Created by asevruk on 9/6/2016.
 */
public class Main {
    public static void main(String[] args) {
        User u1 = new User(1, "Andrey", 0, 1, "Playtika", 1000, new USBank(1, "USA", EUR, 10, 1200, 1, 100000));
        System.out.println(u1);
        User u2 = new User(2, "Petya", 1000, 2, "Ciklum", 2000, new USBank(2, "Canada", USD, 10, 1200, 1, 100000));
        System.out.println(u2);

        User u3 = new User(3, "Katya", 2000, 3, "SoftServ", 3000, new EUBank(3, "Ukaraine", EUR, 10, 1200, 1, 100000));
        System.out.println(u3);
        User u4 = new User(4, "Ira", 3000, 4, "ABB", 1000, new EUBank(1, "Poland", EUR, 10, 1200, 1, 100000));
        System.out.println(u4);


    }
}
