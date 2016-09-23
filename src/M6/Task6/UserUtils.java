package M6.Task6;

/**
 * Created by asevruk on 9/21/2016.
 */
public class UserUtils {


    public static User[] uniqueUsers(User[] users) {
        int lenght = 0;

        for (int i = 0; i <users.length ; i++) {
            if ((users[i] == null)){
                lenght++;
            }
        }


        User[] newArray = new User[users.length-lenght];


        int index = 0;


        for (int i = 0; i < users.length; i++) {

            for (int j = 0; j < users.length; j++) {
                if (!(users[i] ==null) && users[i].equals(users[j])) {
                    index++;
                }
            }

            if (index <= 1 && index != 0 ) {
                newArray[i] = users[i];


            }
            index = 0;


        }
        for (int i = 0; i <newArray.length ; i++) {
            System.out.println(newArray[i]);
        }

        return newArray;
    }


    public static User[] usersWithContitionalBalance(User[] users, int balance) {

        int count = 0;
        int position = 0;


        for (int i = 0; i < users.length; i++) {
            if (!(users[i] ==null) && users[i].getBalance() == balance) {
                count++;
            }
        }

        User[] newUsers = new User[count];

        for (int i = 0; i < users.length; i++) {
            if (!(users[i] ==null) && users[i].getBalance() == balance) {
                newUsers[position] = users[i];
                position++;
            }
        }
        for (User user : newUsers) {
            System.out.println(user);
        }
        return newUsers;

    }


    public final static User[] paySalaryToUsers(User[] users) {

        for (int i = 0; i < users.length; i++) {
            if (!(users[i] ==null)){
                users[i].setBalance(users[i].getBalance() + users[i].getSalary());
            }


        }
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public final static long[] getUsersId(User[] users) {
        int lenght = 0;

        for (int i = 0; i <users.length ; i++) {
            if ((users[i] == null)){
                lenght++;
            }
        }
        long[] idArray = new long[users.length-lenght];
        for (int i = 0; i < users.length; i++) {
            if ((!(users[i] == null))){
                idArray[i] = users[i].getId();
            }


        }
        for (long id : idArray) {
            System.out.println(id);
        }
        return idArray;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }

        }
        User[] newUser = new User[count];

        for (int j = 0; j < users.length; j++) {
            if (users[j] != null) {
                newUser[index] = users[j];
                index++;
            }

        }

        for (User user : newUser) {
            System.out.println(user);
        }
        return newUser;
    }


}



