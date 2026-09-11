package org.example;

/**
 * This class {@code StatementDeliveryService} represents a service for delivering statements to customers
 * either by emailing them or sending them through the post.
 */
public class StatementDeliveryService {

    public void deliverStatement(String statementContent, StatementSender statementSender) {
        statementSender.sendStatement(statementContent);
    }

    public void deliverStatement(Statement statement, StatementSender statementSender) {
        statementSender.sendStatement(statement);
    }

    public static void main(String[] args) {
        // StatementDeliveryService statementDeliveryService = new StatementDeliveryService();

        StatementService statementService = new StatementService();

        EmailStatementSender emailStatementSender = new EmailStatementSender();
        LetterStatementSender letterStatementSender = new LetterStatementSender();

        statementService.generateAndSendAllTransactionsStatement(emailStatementSender);
        statementService.generateAndSendOutgoingStatement(letterStatementSender);

        // statementDeliveryService.deliverStatement("March 2026", emailStatementSender);
        // statementDeliveryService.deliverStatement("July 2026", letterStatementSender);

    }

    /*
    Reflections Questions:
    Q1. Look at the example you just created. Why was it useful to use an interface?
    How would it look if we had only used classes - can you think of any problems that might cause?
    A1. Because there was a need for a contract to hold an abstract method without worrying about its
        implementation. Also, we wanted to share this abstract method with 2 classes, each would flesh it
        out and implemented in its own unique way. Additionally, there was no need for holding a state or
        creating action/behavior therefor, only abstraction was needed an interface was the best bet.

     Q2. How will the use of interfaces make the code more maintainable in future?
         What if we decide we also want the option to send statements via text message?
     A2. At any point in the future: developers can easily understand the purpose behind the interface (having
         a javadoc comment can help make things easier to understand by providing more context),
         through reading its abstract methods, making it easily to work on legacy code. Additionally,
         the interface can easily be updated: remove abstract methods or add them at any point. Moreover,
         You can add further implementations to produce their own version of the abstract method(s) "e.g.,
         send a statement via text message).

      Q3.How does using an interface enforce the contract that it sets out? Again think about writing a new
         text message implementation.
      A3. when a class (in this context TextStatementSender) implements an interface (through the "implements"
          keyword, this enforce the contract that this class will inherit an abstract method (no body) but it
          must provide an implementation to it. So in this context, sendStatement method could be set to log
          " statement has been successfully sent to you via a text." for example.

      Q4. Similarly, what if we decide in future that physical letters are no longer supported; which code
          do we need to update?
      A4. the "LetterStatementSender" class should no longer "implements" the "StatementSender" interface.

      Q5. Think about how you would test StatementDeliveryService. In practice you wouldn’t want to send an actual
          email or a letter every time you ran the test, so how could the StatementSender interface help here?
          (NB our expectation here is for a testing-implementation as they won’t have covered mocking yet.
      A5. Since StatementDeliveryService class depends on StatementSender interface, that means you can implement
          a test without the unwanted side effect "sending email or letter).

     */
}
