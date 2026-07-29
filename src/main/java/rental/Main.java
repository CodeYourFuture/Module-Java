package rental;

import rental.model.Contract;
import rental.model.RentalSummary;
import rental.service.RentalSummaryService;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    Contract contract = new Contract(
            "Shadi far",
            40,
            LocalDate.of(2026, 9, 1),
            20000,
            3
    );


    RentalSummaryService service = new RentalSummaryService();

    RentalSummary summary = service.generateRentalSummary(contract);


    System.out.println(summary);
  }
}