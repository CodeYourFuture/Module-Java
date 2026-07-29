package rental.model;

import java.time.LocalDate;

public class Contract {

    private final String customerName;
    private final int customerAge;
    private final LocalDate startDate;
    private final double carPrice;
    private final int contractLengthYears;


    public Contract(String customerName,
                    int customerAge,
                    LocalDate startDate,
                    double carPrice,
                    int contractLengthYears) {


        if (carPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        if (startDate == null) {
            throw new IllegalArgumentException("Start date cannot be null");
        }

        if (contractLengthYears != 1 && contractLengthYears != 3) {
            throw new IllegalArgumentException("Contract length must be 1 or 3 years");
        }


        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        this.carPrice = carPrice;
        this.contractLengthYears = contractLengthYears;
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


    public double getCarPrice() {
        return carPrice;
    }


    public int getContractLengthYears() {
        return contractLengthYears;
    }
}