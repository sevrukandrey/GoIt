package M5.Task7;

/**
 * Created by asevruk on 9/15/2016.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.requstRooms(100,1,"Kiev","a");
        System.out.println("---------------------");
        controller.requstRooms(1001, 1, "Kiev", "a");
        System.out.println("---------------------");
        controller.requstRooms(100, 10, "Kiev", "a");
        System.out.println("---------------------");


    }

}
