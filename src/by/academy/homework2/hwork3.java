package by.academy.homework;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean exit = true;
        while(exit) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            if(s1.length() % 2 == 0 & s2.length() % 2 == 0 & !s1.isEmpty() & !s2.isEmpty()){
                StringBuilder str1 = new StringBuilder(s1);
                StringBuilder str2 = new StringBuilder(s2);
                int tempS1 = s1.length()/2;
                str1.delete(tempS1,s1.length());
                int tempS2 = s2.length()/2;
                str2.delete(0,tempS2);
                str1.append(str2);
                System.out.println(str1);
                exit = false;
            }
        }
    }
}
