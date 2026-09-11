package org.example;

import java.time.LocalDate;

/**
 * This class {@code OutgoingTransactionsMonthlyStatement} represents a monthly bank statement
 * summarising all outgoing transactions for a customer.
 */
public class OutgoingTransactionsMonthlyStatement implements Statement{

    private String customerName;
    private String bankName;
    private double balance;
    private LocalDate statementDate;

    public OutgoingTransactionsMonthlyStatement(String customerName, String bankName, double balance, LocalDate statementDate) {
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
