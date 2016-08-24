package M2;


public class Task3 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        withdrawMoney("123", 490, balances, ownerNames);

    }

    public static void withdrawMoney(String name, double withdrawal, int[] balances, String[] ownerName) {


        for (int i = 0; i < ownerName.length; i++) {

            if ((!ownerName[i].equals(name)) && (ownerName.length == i + 1)) {
                System.out.println("there is no custumer name");

            } else if (ownerName[i].equals(name)) {
                int ownerId = i;
                double newbalance = (balances[i] - withdrawal) - (withdrawal * 0.05);
                if (newbalance >= 0) {
                    System.out.println(ownerName[i] + " " + withdrawal + " " + newbalance);
                    break;
                } else {
                    System.out.println(ownerName[i] + " NO");
                    break;
                }


            }
        }

    }
}