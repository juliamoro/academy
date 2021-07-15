package by.academy.homework1;

import java.util.Scanner;

public class work3 {

        public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nam = scanner.nextInt();
        System.out.println("Print nam = ");
        table(nam);

    }

    public static void table(int num) {
        int now = 0;
        for (int i = 1; i <= 10; i++) {
            now = i * num;
            System.out.println(i + " = " + now);
        }
    }
}
