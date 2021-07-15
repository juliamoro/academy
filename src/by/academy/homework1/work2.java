package by.academy.homework1;

import java.util.Scanner;

public class work2 {

    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
System.out.println("switch :");
int ch = scan.nextInt();
        switch(ch){
        case 1:
            if(ch%2==0){

            }
            else{

            }
            break;
        case 2:
      //     int x = str * 70 / 100;
            break;
        case 3:
    //       int a = str * str ;
            break;
        case 4:
            System.out.println("Hello "+ str);
            break;
        default:
            System.out.println("Unsupported type");}

    }
}
