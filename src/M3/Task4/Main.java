package M3.Task4;

/**
 * Created by Andrew on 8/31/2016.
 */
public class Main {
    public static void main(String[] args) {
        User v = new User();


        v.setSalary(10);
        System.out.println(v.getSalary());

        v.setBalance(100);
        System.out.println(v.withdraw(10));



        v.setCompanyName("asf");
        System.out.println(v.companyNameLenfht());



        v.setMonthsOfEmployment(1);
        v.monthIncreaser(1);
        System.out.println(v.getMonthsOfEmployment());
    }
}
