package rental.calculator;

import rental.model.Contract;
import rental.model.Rental;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ThreeYearsContractRentalGenerator implements RentalCalculator {


    @Override
    public List<Rental> generateRentals(Contract contract) {

        List<Rental> rentals = new ArrayList<>();

        int numberOfRentals = 36;

        double monthlyCapital = contract.getCarPrice() / numberOfRentals;

        double monthlyInterest = (contract.getCarPrice() * 0.03) / numberOfRentals;


        for (int i = 1; i <= numberOfRentals; i++) {

            LocalDate dueDate = contract.getStartDate().plusMonths(i);

            Rental rental = new Rental(
                    dueDate,
                    monthlyCapital,
                    monthlyInterest
            );

            rentals.add(rental);
        }

        return rentals;
    }
}