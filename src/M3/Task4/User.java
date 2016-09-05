package M3.Task4;

/**
 * Created by Andrew on 8/31/2016.
 */
public class User {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    private String name;
    private int balance ;
    private int monthsOfEmployment;
    private String companyName;
    private int salary ;
    private String currency;

    void paySalary() {
        balance = balance + salary;
    }

    double withdraw(int summ) {
        if (summ < 1000) {
            return balance = (int) (balance - (summ + (summ * 0.05)));
        } else if (summ >= 1000) {
            return balance = (int) (balance - (summ + (summ * 0.1)));
        } else return balance;
    }

    int companyNameLenfht() {
        return companyName.length();

    }

    void monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
    }


}
