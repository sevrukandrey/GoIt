package Task8.Task1;

/**
 * Created by asevruk on 10/18/2016.
 */
public class User {

    public User(long id, String fitstName, String lastName, int salary, int balance) {
        this.id = id;
        this.fitstName = fitstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fitstName='" + fitstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", balance=" + balance +
                '}';
    }

    private long id;
    private String fitstName;
    private String lastName;
    private int salary;
    private int balance;

}
