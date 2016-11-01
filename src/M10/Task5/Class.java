package M10.Task5;

/**
 * Created by asevruk on 10/31/2016.
 */
public class Class {
    public static void testMethod() throws Exception1,Exception2,Exception3{


        throw  new Exception1("a");




    }

    public static void main(String[] args) throws Exception3, Exception2, Exception1 {
        try{
            testMethod();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
