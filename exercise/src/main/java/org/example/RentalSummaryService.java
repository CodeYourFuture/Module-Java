package org.example;

import java.time.LocalDate;
import java.util.Optional;
import java.util.List;

import static org.example.Contract.ContractLengthYears.One_YEAR;

public class RentalSummaryService {

    private Optional<RentalSummary> generateRentalSummary(Contract contract) {

        RentalCalculator rentalCalculator;

        if (contract.getContractLengthYears() == One_YEAR) {
            rentalCalculator = new OneYearContractRentalGenerator();
        } else {
            rentalCalculator = new ThreeYearContractRentalGenerator();
        }

        List<Rental> rentals = rentalCalculator.generateRentals(contract);

        LocalDate endDate = rentals.getLast().getDueDate();

        Rental nextDueRental = rentals.stream()
                .filter(rental -> !rental.isPaid())
                .findFirst()
                .orElse(null);

        double capitalAmount = rentals.stream()
                .mapToDouble(Rental::getCapitalAmount)
                .sum();


        double interestAmount = rentals.stream()
                .mapToDouble(Rental:: getInterestAmount)
                .sum();

        int numberOfRemainingRentals = (int) rentals.stream()
                .filter(rental -> !rental.isPaid())
                .count();

        RentalSummary rentalSummary = new RentalSummary(contract.getCustomerName(), contract.getCustomerAge(), contract.getStartDate(), endDate, rentals,  nextDueRental, capitalAmount, interestAmount, numberOfRemainingRentals);

        if (LocalDate.now().isAfter(endDate)) {
            return Optional.empty();
        }

        return Optional.of(rentalSummary);
    }


    void printRentalSummary(Contract contract) {
        Optional<RentalSummary> rentalSummary = generateRentalSummary(contract);

        if (rentalSummary.isPresent()) {
            System.out.println(rentalSummary.get());
        } else {
            System.out.println("Contract is completed.");
        }
    }
}
