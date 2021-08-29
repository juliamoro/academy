package homework6;
/*Прочесть информацию введеную из клавиатури и записать в
созданный вами txt файл, если введена "stop" строка тогда закончить запись
в файл.*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File f = new File("D:\\example.txt");
        if (f.createNewFile()) {
            System.out.println("File created");
        }
        else {
            System.out.println("File already exists");
        }
        FileWriter write = new FileWriter(f);
        while (true) {
            String text = scanner.nextLine();
            if (!text.equals("stop")) {
                write.write(text );
                break;
            }
            else{
                write.flush();
                write.close();
            }
        }
    }
}
