package M4.Task6;

import static M4.Task6.Currency.EUR;
import static M4.Task6.Currency.USD;

/**
 * Created by asevruk on 9/5/2016.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avgSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avgSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == USD) {
            return 100;
        } else
            return 150;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == EUR) {
            return 5000;
        } else
            return 10000;
    }


    @Override
    double getMonthlyRate() {
        if (getCurrency() == USD) {
            return 1;
        } else
            return 0;
    }

    @Override
    double getCommission(int sum) {
        if (getCurrency() == USD) {
            if (sum <= 1000) {
                return 0.03;

            } else
                return 0.05;
        } else if (sum <= 1000) {
            return 0.1;

        } else
            return 0.11;


    }
}
