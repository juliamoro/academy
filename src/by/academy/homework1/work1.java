package by.academy.homework1;

import java.util.Scanner;

public class work1 {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Amount of purchases :");
        int sum = scan.nextInt();
        System.out.println("Age :");
        int age = scan.nextInt();
        System.out.println("ФИНАЛЬНАЯ ЦЕНA");
        int num = scan.nextInt();
        int finalsum = 0;
        switch (num) {
            case 1:
                if (sum > 0 && sum < 100) {
                    finalsum = sum - ( sum * 5/100);
                }
                System.out.println("Sum = " + finalsum);
                break;
            case 2:
                if (sum >= 100 && sum < 200) {
                    finalsum = sum - ( sum * 7/100);
                }
                System.out.println("Sum = " + finalsum);
                break;
            case 3:
                if(age>= 18){
                    if (sum >= 200 && sum < 300) {
                        finalsum = sum - ( sum * (12+4)/100);
                        System.out.println("Sum = " + finalsum);
                    }
                    else{
                        if(age>0){
                            if (sum >= 200 && sum < 300) {
                                finalsum = sum - ( sum * (12-4)/100);
                                System.out.println("Sum = " + finalsum);
                            }
                        }
                    }
                }
                break;
            case 4:
                if (sum >= 300 && sum < 400) {
                    finalsum = sum - ( sum * 15/100);
                }
                System.out.println("Sum = " + finalsum);
                break;
            case 5:
                if (sum >= 400) {
                    finalsum = sum - ( sum * 20/100);
                }
                System.out.println("Sum = " + finalsum);
                break;
            default:
                System.out.println("Error");
        }
    }
}
