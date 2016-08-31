package M3.Task3;

import java.util.Date;

/**
 * Created by asevruk on 8/31/2016.
 */
public class Course {
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourseDuration() {
        return hourseDuration;
    }

    public void setHourseDuration(int hourseDuration) {
        this.hourseDuration = hourseDuration;
    }

    public String getTracherName() {
        return tracherName;
    }

    public void setTracherName(String tracherName) {
        this.tracherName = tracherName;
    }

    private Date startDate;
    private String name;
    private int hourseDuration;
    private String tracherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hourseDuration, String tracherName, String name) {
        this.hourseDuration = hourseDuration;
        this.tracherName = tracherName;
        this.name = name;
    }

    public Course(Date startDate, String name, int hourseDuration, String tracherName) {
        this.startDate = startDate;
        this.name = name;
        this.hourseDuration = hourseDuration;
        this.tracherName = tracherName;
    }
}
