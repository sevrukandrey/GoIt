package M4.Task6;

import static M4.Task6.Currency.*;

/**
 * Created by asevruk on 9/6/2016.
 */
public class Main
{
    public static void main(String[] args) {
        User u1= new User(1,"Andrey",0,1,"Playtika",1000,new USBank(1,"USA", EUR,10,1200,1,100000));
        User u2= new User(2,"Petya",1000,2,"Ciklum",2000,new USBank(1,"Canada", USD,10,1200,1,100000));

        User u3= new User(3,"Katya",2000,3,"SoftServ",3000,new EUBank(1,"Ukaraine", EUR,10,1200,1,100000));
        User u4= new User(4,"Ira",3000,4,"ABB",1000,new EUBank(1,"Poland", EUR,10,1200,1,100000));

        User u5= new User(5,"Oran",4000,5,"DataArt",1000,new ChinaBank(1,"Croatia", EUR,10,1200,1,100000));
        User u6= new User(6,"John",5000,6,"Funtime",1000,new ChinaBank(1,"Belarus", USD,10,1200,1,100000));
    }
}
