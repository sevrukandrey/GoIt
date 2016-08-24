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

        if (withdrawBalance(ownerName, withdraw) > 0) {
            System.out.println(ownerName + " " + withdraw + " " + withdrawBalance(ownerName, withdraw));
        } else {
            System.out.println(ownerName + " " + "NO");

        }
        System.out.println(ownerName + " " + fundBalance(ownerName, 200));


    }


    static double withdrawBalance(double balance, double withdrawal) {
        return (balance - withdrawal) - withdrawal * 0.05;
    }

    static double withdrawBalance(String ownerName, double withdrawal) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                return Task2.withdrawBalance(balances[i], withdrawal);
            }
        }
        return 0;
    }

    static double fundBalance(String ownerName, double fund) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double newBalance = 0;


        for (int i = 0; i < ownerNames.length; i++) {

            if (ownerNames[i].equals(ownerName)) {
                newBalance += balances[i] + fund;
                break;
            }
        }
        return newBalance;
    }

}
