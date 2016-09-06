package M4.Task6;

/**
 * Created by asevruk on 9/5/2016.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        user.setBalance(user.getBalance()-amount-userBank.getCommission(amount));

    }

    @Override
    public void fundUser(User user, int amount) {
        user.setBalance(user.getBalance()+amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBalance()>=amount){
            toUser.setBalance(toUser.getBalance()+amount);
            fromUser.setBalance(fromUser.getBalance()-amount);
        } else
            System.out.println("There are no money");



    }

    @Override
    public void paySalary(User user) {
    user.setBalance(user.getBalance()+user.getSalary());

    }
}
