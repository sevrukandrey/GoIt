package M6.Task5;

/**
 * Created by asevruk on 9/21/2016.
 */
public class UserUtils {


    User[] uniqueUsers(User[] users) {
        User[] newArray = new User[users.length];

        int index = 0;


        for (int i = 0; i < users.length; i++) {

            for (int j = 0; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    index++;
                }
            }

            if (index <= 1) {
                newArray[i] = users[i];


            }
            index = 0;


        }

        return null;
    }


    User[] usersWithContitionalBalance(User[] users, int balance) {

        int count = 0;
        int position = 0;


        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                count++;
            }
        }

        User[] newUsers = new User[count];

        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                newUsers[position] = users[i];
                position++;
            }
        }
        for (User user : newUsers) {
            System.out.println(user);
        }
        return newUsers;

    }


    public final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());

        }
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public final long[] getUsersId(User[] users) {
        long[] idArray = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            idArray[i] = users[i].getId();

        }
        for (long id : idArray) {
            System.out.println(id);
        }
        return idArray;
    }

    User[] deleteEmptyUsers(User[] users) {
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



