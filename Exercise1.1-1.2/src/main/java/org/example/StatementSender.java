package org.example;

/**
 * Defines a contract for sending monthly statements to customers.
 * Contains an abstract method {@code sendStatement} which will be implemented differently by two extending
 * interfaces.
 *
 * @author  Hassan Osman
 * @version 1.0
 * @since 1.0
 */
public interface StatementSender {
    /**
     * Sends monthly statements to customers.
     *
     * @param statementContent the content of the statement to be sent
     */
    void sendStatement(String statementContent);

    void sendStatement(Statement statement);
}

/*
Questions and Answers - exercise 1.1:

Q1. What should the return type of this method be?
A1. There won't be any return, since the method is intended to print to the console. Thus, it should be
    proceeded with "void".

Q2. What is the visibility of interface methods? Why?
A2. public so that they are easily accessible by all implementing classes.

Q3. Why is this Javadoc important? Think about who we are aiming this javadoc at
(i.e. who will read it / benefit from it)?
A3. Besides providing description, it let other developers understand the puporse behind the interface
    and its abstract method.
*/


