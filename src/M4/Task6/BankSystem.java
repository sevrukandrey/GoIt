package M4.Task6;

/**
 * Created by asevruk on 9/5/2016.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
