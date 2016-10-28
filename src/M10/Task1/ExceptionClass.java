package M10.Task1;

/**
 * Created by asevruk on 10/27/2016.
 */
public class ExceptionClass {
    public static void main(String[] args) throws java.lang.Exception {


       try
       {
          throw new Exception("String argument for exception");
       }
       catch (Exception e ) {
           System.out.println(e.getMessage());
       }




    }


}
