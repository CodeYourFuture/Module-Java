package org.example;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn", "Ali", "Sam"};
        String[] lastNames = {"Hassan", "Doe", "Pappas", "Clarke", "Jones", "Hassan", "Clarke"};
        int[] grades = {22, 45, 35, 22, 41, 48, 39};

        StudentGrades studentGrades = new StudentGrades(firstNames, lastNames, grades);

        System.out.println(Arrays.toString(studentGrades.getFirstNames()));
        System.out.println(studentGrades.getDistinctFirstNames(firstNames));
        System.out.println(studentGrades.getDistinctFirstNamesInAlphabeticalOrder(firstNames));
        System.out.println(studentGrades.getLastNameToGrade(lastNames, grades));

        System.out.println(studentGrades.getStudentToGrade());


        List<String> firstNamesList = new ArrayList<>(Arrays.asList(studentGrades.getFirstNames()));
        Set<String> distinctFirstNamesSet = studentGrades.getDistinctFirstNames(firstNames);
        Set<String> distinctFirstNamesInAlphabeticalOrderSet = studentGrades.getDistinctFirstNamesInAlphabeticalOrder(firstNames);
        Map<String, Integer> lastNamesToGradesMap = studentGrades.getLastNameToGrade(lastNames, grades);
        Map<Student, Integer> studentToGradeMap = studentGrades.getStudentToGrade();


        firstNamesList.add("Patrick");
        distinctFirstNamesSet.add("Patrick");
        distinctFirstNamesInAlphabeticalOrderSet.add("Patrick");
        lastNamesToGradesMap.put("Smith", 49);
        studentToGradeMap.put(new Student("Patrick", "Smith"), 49);

        firstNamesList.remove("Patrick");
        distinctFirstNamesSet.remove("Patrick");
        distinctFirstNamesInAlphabeticalOrderSet.remove("Patrick");
        lastNamesToGradesMap.remove("Smith", 49);
        studentToGradeMap.remove(new Student("Patrick", "Smith"), 49);

        lastNamesToGradesMap.replace("Smith", 49, 0);
        studentToGradeMap.replace(new Student("Patrick", "Smith"), 49, 0);

        int highestGrade = Arrays.stream(grades).max().getAsInt();
        System.out.println(highestGrade); // Highest grade is 48

        int lowestGrade = Arrays.stream(grades).min().getAsInt();
        System.out.println(lowestGrade); // Lowest grade is 22



        Student highestGradeStudent = studentToGradeMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(highestGradeStudent.getFirstName());
        System.out.println(highestGradeStudent.getLastName());




        Set<String> duplicateFirstNames = firstNamesList.stream()
                .filter(firstName -> Collections.frequency(firstNamesList, firstName) > 1)
                .collect(Collectors.toSet());

        System.out.println(duplicateFirstNames);


    }


}


