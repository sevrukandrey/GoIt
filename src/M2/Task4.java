package M2;

/**
 * Created by asevruk on 8/26/2016.
 */
public class Task4 {
    public static void main(String[] args) {
        double balance = 100;
        double withdraw = 10000;
        String ownerName = "Ann";
        System.out.println(ownerName + " " + fundBalance(ownerName, 200));

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
