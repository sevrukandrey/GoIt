package Task7.Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by asevruk on 10/11/2016.
 */
public class Main {
    public static void main(String[] args) {


        List<String> i1 = new ArrayList<>();
        List<String> i2 = new LinkedList<>();


        for (int i = 0; i <10000000 ; i++) {
            i1.add("1");
            i2.add("1");

        }
        long statTime = System.currentTimeMillis();
        i1.add("1");
        long timeSpent = System.currentTimeMillis()-statTime;
        System.out.println("add  to Array  " + timeSpent);


        long statTime1 = System.currentTimeMillis();
        i2.add("1");
        long timeSpent1 = System.currentTimeMillis()-statTime1;
        System.out.println("add String to Linked  " + timeSpent1);

        long statTime2 = System.currentTimeMillis();
        i1.set(100000, "2");
        long timeSpent2 = System.currentTimeMillis()-statTime2;
        System.out.println("set Array   " + timeSpent2);


        long statTime3 = System.currentTimeMillis();
        i2.set(100000, "1");
        long timeSpent3 = System.currentTimeMillis()-statTime3;
        System.out.println("set Linked  " + timeSpent3);

        long statTime4 = System.currentTimeMillis();
        i1.get(500000);
        long timeSpent4 = System.currentTimeMillis()-statTime4;
        System.out.println("get Array   " + timeSpent4);


        long statTime5 = System.currentTimeMillis();
        i2.get(500000);
        long timeSpent5 = System.currentTimeMillis()-statTime5;
        System.out.println("get Linked  " + timeSpent5);

        long statTime6 = System.currentTimeMillis();
        i1.remove(500000);
        long timeSpent6 = System.currentTimeMillis()-statTime6;
        System.out.println("rem Array   " + timeSpent6);


        long statTime7 = System.currentTimeMillis();
        i2.remove(500000);
        long timeSpent7 = System.currentTimeMillis()-statTime7;
        System.out.println("rem Linked  " + timeSpent7);

    }
}
