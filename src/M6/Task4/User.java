package M6.Task4;

/**
 * Created by asevruk on 9/21/2016.
 */
public class User {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFitstName() {
        return fitstName;
    }

    public void setFitstName(String fitstName) {
        this.fitstName = fitstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User(long id, String fitstName, String lastName, int salary, int balance) {
        this.id = id;
        this.fitstName = fitstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    private long id;
    private String fitstName;
    private String lastName;
    private int salary;
    private int balance;

}
