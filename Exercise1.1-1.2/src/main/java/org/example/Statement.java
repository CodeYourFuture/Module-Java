package org.example;

import java.time.LocalDate;

/**
 * This interface {@code Statement} represents a bank statement, providing details about the customer,
 * bank, balance, and the date the statement was issued.
 *
 */
public interface Statement {
    /**
     * This abstract method {@code getCustomerName()} is expected to return the
     * name of the customer this statement belongs to.
     *
     * @return customer name
     */
    String getCustomerName();

    /**
     * This abstract method {@code getBankName()} is expected to return a bank name associated with the statement.
     *
     * @return bank name
     */
    String getBankName();

    /**
     * This abstract method {@code getBalance()} is expected to return the balance this statement belongs to.
     *
     * @return balance
     */
    double getBalance();

    /**
     * This abstract method {@code getStatementDate()} is expected to return the date
     * this statement was issued on.
     *
     * @return statement date
     */
    LocalDate getStatementDate();
}



/*
Questions and Answers - exercise 1.2:

Q1. What is it called when you have two versions of the same method?
A1. Method Overloading - which is a form of Polymorphism.

Q2. What methods might Statement have? Think about the type of information you’d expect to see on a bank statement.
A2. getCustomer() method - to get the name of a customer, getBalance() method - to get the balance in the statement,
    getBank() method - to get the name of the bank and many more.

Q3. How should the implementation behaviour differ?
A3. Once abstracted methods inherited from the interface, each class should override and implement each abstract
    method differently depending on the class role and responsibility.

Q4. You’re now starting to build up a hierarchy of classes and interfaces. Have a look back through the reflection
    questions about and apply them to your refactored system - are the answers the same? Are interfaces even more
    important now? Imagine we increased the complexity even further by adding more services and functionality - do
    interfaces become more or less important?
A4. In a summary, interfaces become more improtant as a system complexity increases.


 */