package homework6;

import java.io.*;

public class Task2 {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("D:\\f1.txt");
        if (!inputFile.exists()) {
            inputFile.createNewFile();
        }

        File outputFile = new File("D:\\result.txt");

        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }

        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferReader = new BufferedReader(fileReader);
        FileWriter writer = new FileWriter(outputFile);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        String line=bufferReader.readLine();

        while (line  != null) {
            line = bufferReader.readLine();
            String newLine = line.replaceAll("\\s","");
            bufferWriter.write(newLine);
        }

        }
    }


