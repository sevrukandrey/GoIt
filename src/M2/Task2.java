package M2;


public class Task2 {

    public static void main(String[] args) {
        double balance = 100;
        double withdraw = 10000;
        String ownerName = "Ann";

        if (withdrawBalance(balance, withdraw) >= 0) {
            System.out.println("OK " + withdraw * 0.05 + " " + withdrawBalance(balance, withdraw));

        } else {
            System.out.println("No");
        }
    }


    static double withdrawBalance(double balance, double withdrawal) {
        return (balance - withdrawal) - withdrawal * 0.05;
    }





}
