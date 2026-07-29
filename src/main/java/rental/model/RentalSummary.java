package rental.model;

import java.time.LocalDate;
import java.util.List;

public class RentalSummary {

 private final String customerName;
 private final int customerAge;
 private final LocalDate startDate;
 private final LocalDate endDate;

 private final List<Rental> rentals;
 private final double totalCapital;
 private final double totalInterest;
 private final Rental nextDueRental;
 private final int remainingRentals;


 public RentalSummary(String customerName,
                      int customerAge,
                      LocalDate startDate,
                      LocalDate endDate,
                      List<Rental> rentals,
                      double totalCapital,
                      double totalInterest,
                      Rental nextDueRental,
                      int remainingRentals) {

  this.customerName = customerName;
  this.customerAge = customerAge;
  this.startDate = startDate;
  this.endDate = endDate;
  this.rentals = rentals;
  this.totalCapital = totalCapital;
  this.totalInterest = totalInterest;
  this.nextDueRental = nextDueRental;
  this.remainingRentals = remainingRentals;
 }


 public String getCustomerName() {
  return customerName;
 }


 public int getCustomerAge() {
  return customerAge;
 }


 public LocalDate getStartDate() {
  return startDate;
 }


 public LocalDate getEndDate() {
  return endDate;
 }


 public List<Rental> getRentals() {
  return rentals;
 }


 public double getTotalCapital() {
  return totalCapital;
 }


 public double getTotalInterest() {
  return totalInterest;
 }


 public Rental getNextDueRental() {
  return nextDueRental;
 }


 public int getRemainingRentals() {
  return remainingRentals;
 }

 @Override
 public String toString() {

  return "RentalSummary{" +
          "\ncustomerName='" + customerName + '\'' +
          "\ncustomerAge=" + customerAge +
          "\nstartDate=" + startDate +
          "\nendDate=" + endDate +
          "\ntotalCapital=" + totalCapital +
          "\ntotalInterest=" + totalInterest +
          "\nremainingRentals=" + remainingRentals +
          "\nnextDueRental=" + nextDueRental +
          "\n}";
 }

}