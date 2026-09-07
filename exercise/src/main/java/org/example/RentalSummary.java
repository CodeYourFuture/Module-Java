package org.example;

import java.time.LocalDate;
import java.util.List;

public class RentalSummary {
    private String customerName;
    private String customerAge;
    private LocalDate startDate;
    private LocalDate endDate;
    private  List<Rental> rentals;
    private Rental nextDueRental;
    private double capitalAmount;
    private double interestAmount;
    private int numberOfRemainingRentals;


    public RentalSummary(String customerName, String customerAge, LocalDate startDate, LocalDate endDate, List<Rental> rentals, Rental nextDueRental, double capitalAmount, double interestAmount, int numberOfRemainingRentals) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentals = rentals;
        this.nextDueRental = nextDueRental;
        this.capitalAmount = capitalAmount;
        this.interestAmount = interestAmount;
        this.numberOfRemainingRentals = numberOfRemainingRentals;
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAge() {
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

    public Rental getNextDueRental() {
        return nextDueRental;
    }

    public double getCapitalAmount() {
        return capitalAmount;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public int getNumberOfRemainingRentals() {
        return numberOfRemainingRentals;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "RentalSummary{" +
                "customerName='" + customerName + '\'' +
                ", customerAge='" + customerAge + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", rentals=" + rentals +
                ", nextDueRental=" + nextDueRental +
                ", capitalAmount=" + capitalAmount +
                ", interestAmount=" + interestAmount +
                ", numberOfRemainingRentals=" + numberOfRemainingRentals +
                '}';
    }
}
