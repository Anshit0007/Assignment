package Introduction_to_java_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question3 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java WordCounter <filename> <word>");
            return;
        }

        String fileName = args[0];
        String targetWord = args[1];
        int count = 0;
        String path = "/home/anshit/Documents/" + fileName;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            reader.close();
            System.out.println("The word \"" + targetWord + "\" occurred " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

}


