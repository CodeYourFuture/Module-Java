package org.example;

/**
 * This class {@code EmailStatementSender} emails monthly statements to customers.
 */
public class EmailStatementSender implements StatementSender{

    @Override
    public void sendStatement(String statementContent) {
        System.out.println(statementContent + " statement has been successfully emailed to you.");
    }

    @Override
    public void sendStatement(Statement statement) {
        System.out.println("Statement Date: " + statement.getStatementDate());
        System.out.println("Customer Name: " + statement.getCustomerName());
        System.out.println("Bank Name: " + statement.getBankName());
        System.out.println("Balance: £" + statement.getBalance());
        System.out.println("Your monthly statement has been emailed to you successfully.");
    }
}
