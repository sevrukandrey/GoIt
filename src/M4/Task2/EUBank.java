package M4.Task2;

/**
 * Created by asevruk on 9/5/2016.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avgSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avgSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission() {
        return 0;
    }
}
