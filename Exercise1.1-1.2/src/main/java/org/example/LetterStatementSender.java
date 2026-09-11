package org.example;

/**
 * This class {@code LetterStatementSender} sends monthly statements to customers through the post in letter form.
 */
public class LetterStatementSender implements StatementSender {

    @Override
    public void sendStatement(String statementContent) {
        System.out.println(statementContent + " statement has been successfully posted to your address.");
    }

    @Override
    public void sendStatement(Statement statement) {
        System.out.println("Statement Date: " + statement.getStatementDate());
        System.out.println("Customer Name: " + statement.getCustomerName());
        System.out.println("Bank Name: " + statement.getBankName());
        System.out.println("Balance: £" + statement.getBalance());
        System.out.println("The statement has been successfully posted to your address.");
    }
}
