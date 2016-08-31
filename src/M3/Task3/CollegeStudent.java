package M3.Task3;

/**
 * Created by asevruk on 8/31/2016.
 */
public class CollegeStudent extends  Student {

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(){

    }

    public CollegeStudent(String firtsName, String lastName, int group) {
        super(firtsName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String collegeName,int rating,long id){

        this.collegeName=collegeName;
        this.id=id;
        this.rating=rating;
    }

}
