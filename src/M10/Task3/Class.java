package M10.Task3;

/**
 * Created by asevruk on 10/31/2016.
 */
public class Class {
    public static void main(String[] args) {
        Class c1 = new Class();
        c1 = null;
try{
    System.out.println(c1.hashCode());
}
catch (NullPointerException e){
    System.out.println("NullPointerException" + e);
}

    }
}
