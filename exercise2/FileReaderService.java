//Exercise 3.2

package exercise2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderService {
    String readFile(String filename) throws InvalidFileFormatException {

        String fileContent = "";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){

            String line;


            while((line = bufferedReader.readLine()) != null) {
                fileContent += line;
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            return "";
        } catch (IOException e) {
            System.out.println("Failed to read file");
            return "";
        }

        if (fileContent.length() == 0) {
            throw new InvalidFileFormatException("File is empty");
        }
        return fileContent;
    }

    static void main(String[] args) {

        FileReaderService fileReaderService = new FileReaderService();
        try{

            fileReaderService.readFile("main.txt");
            fileReaderService.readFile("");
            fileReaderService.readFile(null);

        } catch (InvalidFileFormatException e) {
            System.out.println("File is empty");
        }
    }

}

/*
Reflections

Q1. Why are FileNotFoundException and IOException checked rather than unchecked exceptions? What advantages does this
   give developers and systems that use them?
A1. Because the program can be recovered from these sorts of exceptions. And most importantly, those exceptions can be
    dealt with by the user. For example, if the user shown "file not found", then the user can simply ensure to upload/
    place the file. Also, if the file failed to read or issue while reading, the user can simply handle that. The
    advantage is that all possible scenarios are handled and taken care of, so when an exception is thrown, users are
    communicated, and thus know how to react.

Q2. In this example we had control over which strings we passed to the method, so in theory we could make sure they
    wouldn’t ever be null. When writing production code do we have this same level of control?
A2. Definitely not, since once in production, end-user have the freedom to do as they please.

Q3. When is it beneficial to include null checks, and when isn’t it?
A3. If there program contains a reference to a data which could have the value of null logically and thus, associated
    logic may be impacted by this throw "NullPointerException" then there should be a null check.

Q4. How does try-with-resources relate to a try/finally block? Think about flexibility / clean code etc
A4. try-with-resources is more flexible since it benefits from resources being automatically closes once they are no
    longer in use. it eliminates the need of having a "finally" block which contain a close method. This also means
    that with "try-with-resources", code is more precise, and cleaner.

Q5. If an exception is thrown, does a finally block get executed before or after the catch block? How could you prove
    this?
A5.It gets executed after the "finally" block. This could simply be proven by printing a statement to the console
   inside the "finally" block. The terminal shows this output after the proceeding exceptions being caught and thrown.

Q6. What about if the catch block throws an unchecked exception? Does the finally block still execute?
A6. The finally block still executes, regardless of the exception type.
 */
