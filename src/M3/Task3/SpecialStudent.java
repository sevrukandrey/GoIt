package M3.Task3;

/**
 * Created by asevruk on 8/31/2016.
 */
public class SpecialStudent extends  CollegeStudent {

    public SpecialStudent(String firtsName, String lastName, int group) {
        super(firtsName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(){
        this.secretKey=secretKey;
    }


    private long secretKey;
    private String email;


}
