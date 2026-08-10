package org.example;

public class ExampleTest {
    @BeforeEach
    public void setup() {
        System.out.println("setting up test data");
    ...
    }

    @Test
    public void testExample1() {
        System.out.println("running test case 1");
    ...
    }
    @AfterAll
    public void closeConnections() {
        System.out.println("closing connections");
    ...
    }

    @BeforeAll
    public void createConnections() {
        System.out.println("creating connections");
    ...
    }
}

/*
********** Questions and Answers:
Q1. When the above class test is run, what is the output?
A1. C) creating connections, setting up test data, running test case 1, closing connections

Q2. If we introduce a new @Test annotated method testExample2 and run the test class how many times do we expect the following messages to appear;

    setting up test data
    running test case 1
    closing connections
    creating connections

A2. The messages appear in the following order:
    creating connections (one time)
    setting up test data (once before testExample1)
    running test case 1 (one time)
    setting up test data (once before testExample2)
    running test case 2 (one time)
    closing connections (one time)


******* Reflection on key concepts in automated testing:
Q1. Explain why tests should be independent of each other. What benefit does this bring?
A1. So that result of one does not impact or interfere with the other test(s). IF a test is no longer needed or it needs
    updated this can be easily done when test are separate.

Q2. Explain the difference between a test-case, a test class and a test suite. Why might we use test suites?
A2. A test case is a scenario being tested
    A test class is a class that contains several test methods
    A test suite is a collection of test classes

Q3. Explain the Junit test lifecycle
A3. It's a cycle that contained tests and associated code that execute at a particular order dictated by the lifecycle
    annotations. For example, a code with @BeforeEach or @AfterEach execute before or after each test method, respectively.
    @BeforeAll and @AfterAll execute before all or after all tests, respectively.

Q4. particularly how we can use this to re-use state or reset state between tests and why this is useful from a
    maintainability and performance perspective.
A4. To reuse shared state use @BeforeAll, and to reset state between tests use @BeforeEach and @AfterEach
    In the instance of @BeforeAll, we use it with shared expensive resource such as initialising an object. Repeating
    this process before each test, is pointless, and inefficient. With regards to @BeforeEach and @AfterEach you
     setup the resouces needed for each test and then knock them down and clear the space for the following test to go
     through the same process.


Q5. Are there situations where a test case might not have any assertions?
A5. Yes, there are

Q6. What might a test without assertions miss and how could it be improved?
A6. It'll miss if there's a match between the actual value and the expected result


*/