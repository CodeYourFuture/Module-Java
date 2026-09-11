package org.example;

import java.time.LocalDate;

/**
 * This class {@code AllTransactionsMonthlyStatement} represents a monthly bank statement
 * summarising all ingoing and outgoing transactions for a customer.
 */
public class AllTransactionsMonthlyStatement implements Statement{

    private String customerName;
    private String bankName;
    private double balance;
    private LocalDate statementDate;

    public AllTransactionsMonthlyStatement(String customerName, String bankName, double balance, LocalDate statementDate) {
        this.customerName = customerName;
        this.bankName = bankName;
        this.balance = balance;
        this.statementDate = statementDate;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public LocalDate getStatementDate() {
        return statementDate;
    }


}
