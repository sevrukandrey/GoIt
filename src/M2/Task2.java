package M2;


public class Task2 {
    public static void main(String[] args) {
        withdrawMoney(100, 99);

    }


    public static void withdrawMoney(double balance, double withdrawal) {
        double commision = withdrawal * 0.05;
        double newBalance = 0;
        newBalance = (balance - withdrawal) - withdrawal * 0.05;
        if (newBalance > 0)
            System.out.println("OK " + commision + " " + newBalance);
        System.out.println("NO");

    }


}
