package M4.Task4;

import static M4.Task3.Currency.EUR;
import static M4.Task3.Currency.USD;

/**
 * Created by asevruk on 9/5/2016.
 */
public class EUBank extends Bank {


    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avgSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avgSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == USD) {
            return 2000;
        } else
            return 2200;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == EUR) {
            return 20000;
        } else
            return 10000;
    }


    @Override
    double getMonthlyRate() {
        if (getCurrency() == USD) {
            return 0;
        } else
            return 0.01;
    }

    @Override
    double getCommission(int sum) {
        if (getCurrency() == USD) {
            if (sum <= 1000) {
                return 0.05;

            } else
                return 0.07;
        } else if (sum <= 1000) {
            return 0.02;

        } else
            return 0.04;


    }
}
