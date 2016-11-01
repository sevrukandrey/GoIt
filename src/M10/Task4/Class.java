package M10.Task4;

/**
 * Created by asevruk on 10/31/2016.
 */
public class Class {
    public static void main(String[] args) throws Exception {
        try{
            f();
        }
       catch (Exception e){
           System.out.println(e);
       }
    }
    public static void g() throws Exception {
            throw new Exception("Exception in g method");
    }

    public static void f() throws Exception {
        try{
            g();
        }
        catch (Exception e){
            System.out.println(e);
            throw new Exception("as");
        }

    }
}
