package M4.Task2;

/**
 * Created by asevruk on 9/5/2016.
 */
public abstract class Bank {


    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avgSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avgSalaryOfEmployee = avgSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvgSalaryOfEmployee() {
        return avgSalaryOfEmployee;
    }

    public void setAvgSalaryOfEmployee(double avgSalaryOfEmployee) {
        this.avgSalaryOfEmployee = avgSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }




    private long id;
    private  String  bankCountry;
    private Currency currency;
    private  int numberOfEmployees;
    private  double avgSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    abstract int getLimitOfWithdrawal();
    abstract int getLimitOfFunding();
    abstract int getMonthlyRate();
    abstract int getCommission();

    double moneyPaidMonthlyForSalary(){
        return getAvgSalaryOfEmployee()*getNumberOfEmployees();
    }




}
