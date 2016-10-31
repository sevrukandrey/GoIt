package M10.Task2;

/**
 * Created by asevruk on 10/31/2016.
 */
public class main {
    public static void main(String[] args) {
        try {
            throw  new EscExm("My exception");
        }catch (EscExm e){
            System.out.println(e.getMessage());

        }
    }
}
