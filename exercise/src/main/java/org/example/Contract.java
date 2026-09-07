package org.example;

import java.time.LocalDate;

public class Contract {
    private String customerName;
    private String customerAge;
    private LocalDate startDate;
    private double carPrice;
    private ContractLengthYears contractLengthYears;

    enum ContractLengthYears {
        ONE_YEAR,
        THREE_YEARS
    }




    public Contract(String customerName, String customerAge, LocalDate startDate, double carPrice, ContractLengthYears contractLengthYears) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        this.carPrice = carPrice;
        this.contractLengthYears = contractLengthYears;
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

    public double getCarPrice() {
        return carPrice;
    }

    public ContractLengthYears getContractLengthYears() {
        return contractLengthYears;
    }
}
