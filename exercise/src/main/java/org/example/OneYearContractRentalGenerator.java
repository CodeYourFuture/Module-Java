package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OneYearContractRentalGenerator implements RentalCalculator {

    public List<Rental> generateRentals(Contract contract) {
        List<Rental> rentals = new ArrayList<>();

        double monthlyCapital = contract.getCarPrice() / 12;
        double monthlyInterest = monthlyCapital * 0.02;


        for (int i = 1; i <= 12; i ++) {

            LocalDate dueDate = contract.getStartDate().plusMonths(i);
            LocalDate today = LocalDate.now();

            boolean paid = dueDate.isBefore(today) || dueDate.isEqual(today);

            Rental rental = new Rental(dueDate, monthlyCapital, monthlyInterest, paid);

            rentals.add(rental);

        }

        return rentals;

    }
}
