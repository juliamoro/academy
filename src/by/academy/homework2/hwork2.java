package by.academy.homework2;
import java.util.Scanner;
//task 2
public class hwork2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int col = s.nextInt();
        String min = null;
        s.nextLine();
        for (int i = 0;i<col;i++){
            String log = s.nextLine();
            if(i == 0){
                min = log;
            }
            if(min.length() > log.length()){
                min = log;
            }
        }
        System.out.println(min + " ");
    }
}
