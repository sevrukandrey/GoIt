package M2;

/**
 * Created by asevruk on 8/26/2016.
 */
public class Task3 {
    public static void main(String[] args) {
        double balance = 100;
        double withdraw = 10000;
        String ownerName = "Ann";
        if (withdrawBalance(ownerName, withdraw) > 0) {
            System.out.println(ownerName + " " + withdraw + " " + withdrawBalance(ownerName, withdraw));
        } else {
            System.out.println(ownerName + " " + "NO");

        }
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
}
