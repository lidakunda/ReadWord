package projectFilesExam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExam {
	 public static void main(String[] args) {
	        // Example file path
	        String filePath = "dictionary.txt"; // Replace with your file path
	        readAndPrintDictionary(filePath);
	    }

	    /**
	     * Reads a dictionary file and prints out each word and its meanings.
	     * @param filePath the path to the dictionary file
	     */
	    public static void readAndPrintDictionary(String filePath) {
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                // Split line into word and meanings
	                String[] parts = line.split("-", 2);
	                if (parts.length == 2) {
	                    String word = parts[0].trim();
	                    String meanings = parts[1].trim().replace(",", ", "); // Format meanings
	                    System.out.println(word + ", " + meanings);
	                } else {
	                    System.out.println("Invalid line format: " + line);
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file: " + e.getMessage());
	        }
	    }
	            }
