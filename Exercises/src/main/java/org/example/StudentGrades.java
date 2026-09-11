package org.example;

import java.util.*;

public class StudentGrades {
    private String[] firstNames;
    private String[] lastNames;
    private int[] grades;

    public StudentGrades(String[] firstNames, String[] lastNames, int[] grades) {
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.grades = grades;
    }

    public String[] getFirstNames() {
        return firstNames;
    }

    public String[] getLastNames() {
        return lastNames;
    }

    public int[] getGrades() {
        return grades;
    }

    public Set<String> getDistinctFirstNames(String[] firstNames) {
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(firstNames));
        return set;
    }

    public Set<String> getDistinctFirstNamesInAlphabeticalOrder(String[] firstNames) {
        Set<String> set = new TreeSet<>();
        set.addAll(Arrays.asList(firstNames));
        return set;


    }

    public Map<String, Integer> getLastNameToGrade(String[] lastNames, int[] grades) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < lastNames.length; i++) {
            map.put(lastNames[i], grades[i]);
        }
        return map;
    }


    public Map<Student, Integer> getStudentToGrade() {
        Map<Student, Integer> map = new HashMap<>();

        for (int i = 0; i < firstNames.length; i ++) {
            Student student = new Student(firstNames[i], lastNames[i]);
            map.put(student, grades[i]);
        }
        return map;
    }

}

/*
Reflection - Exercise 2.1

Question: Suppose there are a set of twins in the class, so there are some duplicate lastNames. Can we still build a
          map of students to their grades?

Answer: perhaps we might need a 4th array that provide unique values that could be associated with each student.
        Something like an array of student's ID numbers can work. Otherwise, maybe there's a way for the key to be
        customized to include both the first and last names of each student in such cases.



Reflections - Exercise 2.3
Think about the following questions, make notes and be prepared to talk through your thoughts in the workshop.

Q1. Would it have been possible to use Arrays to model the same data?
A1. Yes, it would.

Q2. Would it have been easier, harder or the same? Why?
A2. It would have been harder. This is because arrays are not dynamic, they are of fixed size, therefore, adding and
    removing elements would have been more challenging.

Q3. What was your thought process when deciding which data structure was most appropriate for modelling particular data?
What things did you consider?
A3. If the goal was to have data represented in key-value pair, then I'd use HashMap (other implementations of Map
    interface can work. If the goal was to have data as distinct values, then I'd use HashSet (other Set interface
    implementations can work), and if order mattered, then I'd go for TreeSet instead. If the data insertion order and
     storing order matters, then, I'd go for an ArrayList (other List implementation can work).

Q4. Suppose the initial data set was input incorrectly and the same student’s name and grade was input twice. How would
    your Map<Student, Grade> handle this? Why?
A4. Since Student is key here, and Student class has implemented both equals() and hashCode() methods, then they will
    consider duplicate student objects as the same object. Therefore, Map<Student, Grade> treats them as the same key.

Q5. What is the difference between variables: a) List firstNames, b) List<String> firstNames,
c) ArrayList<String> firstNames ? Which is preferable? Bonus: how about List<?> firstNames ?
A5. a) is a list interface that may contain different data types
    b) is a list interface of Strings ONLY
    c) is an array list - implementing the List interface - and cntains Strings only

    I prefer List<String> firstNames because interfaces are more flexible, allowing loose coupling and multiple
    inheritance. Also having the input type - String - explicitly stated ensure that no other data type can be passed.

   Regarding List<?> firstNames perhaps it's a list of certain type which is yet to be confirmed.

 */
