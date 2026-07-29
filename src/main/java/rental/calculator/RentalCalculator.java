package rental.calculator;

import rental.model.Contract;
import rental.model.Rental;

import java.util.List;

public interface RentalCalculator {

    List<Rental> generateRentals(Contract contract);

}