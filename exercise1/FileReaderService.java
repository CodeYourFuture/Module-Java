//Exercise 3.1

package exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderService {
    String readFile(String filename) throws InvalidFileFormatException {

        if (filename == null) {
            throw new IllegalArgumentException("File can not be null");
        }

        BufferedReader bufferedReader = null;
        String line;
        String fileContent = "";

        try{
            bufferedReader = new BufferedReader(new FileReader(filename));

            while((line = bufferedReader.readLine()) != null) {
                fileContent += line;
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            return "";
        } catch (IOException e) {
            System.out.println("Failed to read file");
            return "";
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch(IOException e) {
                    System.out.println("Failed to close file");
                }

            }

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
