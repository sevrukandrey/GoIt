package M2;

/**
 * Created by asevruk on 8/26/2016.
 */
public class Task4 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) {

        double fund = 100;
        String ownerName = "Ann";
        System.out.println(ownerName + " " + fundBalance(ownerName, fund));

    }


    static double fundBalance(String ownerName, double fund) {
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
