package org.example;

import java.time.LocalDate;

public class Rental {
    private LocalDate dueDate;
    private double capitalAmount;
    private double interestAmount;
    private boolean paid;


    public Rental(LocalDate dueDate, double capitalAmount, double interestAmount, boolean paid) {
        this.dueDate = dueDate;
        this.capitalAmount = capitalAmount;
        this.interestAmount = interestAmount;
        this.paid = paid;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getCapitalAmount() {
        return capitalAmount;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public boolean isPaid() {
        return paid;
    }

    public String toString() {
        return String.format(
                "Due Date: %s, Capital Amount: %.2f, Interest Amount: %.2f, Paid: %s",
                dueDate,
                capitalAmount,
                interestAmount,
                paid
        );
    }
}
