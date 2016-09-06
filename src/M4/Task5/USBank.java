package M4.Task5;

import static M4.Task5.Currency.EUR;
import static M4.Task5.Currency.USD;

/**
 * Created by asevruk on 9/5/2016.
 */
public class USBank extends Bank {


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avgSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avgSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == USD) {
            return 1000;
        } else
            return 1200;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == EUR) {
            return 10000;
        } else
            return 0;
    }


    @Override
    double getMonthlyRate() {
        if (getCurrency() == USD) {
            return 0.01;
        } else
            return 0.015;
    }

    @Override
    double getCommission(int sum) {
        if (getCurrency() == USD) {
            if (sum <= 1000) {
                return 0.05;

            } else
                return 0.07;
        } else if (sum <= 1000) {
            return 0.06;

        } else
            return 0.08;


    }
}
