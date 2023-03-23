import java.io.*;

public class FileWriterFileReading {

    public static void main(String[] args) {

        // Define the file path and name
        String filePath = "sample.txt";

        // Write to a text file using PrintWriter
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath));
            writer.println("Hello World!");
            writer.println("This is a sample text file.");
            writer.close();
            System.out.println("File written successfully using PrintWriter!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file using PrintWriter.");
            e.printStackTrace();
        }

        // Write to a text file using FileWriter
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write("Appending some more text using FileWriter.\n");
            writer.close();
            System.out.println("File written successfully using FileWriter!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file using FileWriter.");
            e.printStackTrace();
        }

        // Read from a text file using BufferedReader
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("Contents of the file read using BufferedReader:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file using BufferedReader.");
            e.printStackTrace();
        }

        // Read from a text file using FileReader
        try {
            FileReader reader = new FileReader(filePath);
            int character;
            System.out.println("Contents of the file read using FileReader:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file using FileReader.");
            e.printStackTrace();
        }

        // Write to a text file using BufferedWriter
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write("Appending some more text using BufferedWriter.\n");
            writer.close();
            System.out.println("File written successfully using BufferedWriter!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file using BufferedWriter.");
            e.printStackTrace();
        }
    }
}
