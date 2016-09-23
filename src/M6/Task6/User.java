package M6.Task6;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (salary != user.salary) return false;
        if (balance != user.balance) return false;
        if (fitstName != null ? !fitstName.equals(user.fitstName) : user.fitstName != null) return false;
        return !(lastName != null ? !lastName.equals(user.lastName) : user.lastName != null);

    }

    @Override
    public int hashCode() {
        int result = fitstName != null ? fitstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + balance;
        return result;
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
