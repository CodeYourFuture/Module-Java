package rental.service;

import rental.calculator.OneYearContractRentalGenerator;
import rental.calculator.RentalCalculator;
import rental.calculator.ThreeYearsContractRentalGenerator;
import rental.model.Contract;
import rental.model.Rental;
import rental.model.RentalSummary;

import java.time.LocalDate;
import java.util.List;

public class RentalSummaryService {

    public RentalSummary generateRentalSummary(Contract contract) {

        RentalCalculator calculator;

        if (contract.getContractLengthYears() == 1) {
            calculator = new OneYearContractRentalGenerator();
        } else {
            calculator = new ThreeYearsContractRentalGenerator();
        }

        List<Rental> rentals = calculator.generateRentals(contract);

        double totalCapital = 0;
        double totalInterest = 0;
        int remainingRentals = 0;
        Rental nextDueRental = null;

        for (Rental rental : rentals) {

            totalCapital += rental.getCapitalAmount();
            totalInterest += rental.getInterestAmount();

            if (!rental.isPaid()) {

                remainingRentals++;

                if (nextDueRental == null) {
                    nextDueRental = rental;
                }
            }
        }

        LocalDate endDate = contract.getStartDate()
                .plusYears(contract.getContractLengthYears());

        return new RentalSummary(
                contract.getCustomerName(),
                contract.getCustomerAge(),
                contract.getStartDate(),
                endDate,
                rentals,
                totalCapital,
                totalInterest,
                nextDueRental,
                remainingRentals
        );
    }
}