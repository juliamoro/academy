package by.academy.homework;

import java.util.Random;
import java.util.Scanner;

public class hwork4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(number>1){
            for (int i = 1; i <= number; i++) {
                System.out.println("Игрок "+ number);
                deck();
            }

        }
    }

    public static void deck () {
        String[] deckList = {"JOFCLUBS", "QOFCLUBS", "KOFCLUBS", "AOFCLUBS",
                "SIXOFCLUBS","SEVENOFCLUBS","EIGHTOFCLUBS","NINEOFCLUBS","TENOFCLUBS", "JOFDIAMONDS", "QOFDIAMONDS", "KOFDIAMONDS", "AOFDIAMONDS",
                "SIXOFDIAMONDS","SEVENOFDIAMONDS","EIGHTOFDIAMONDS","NINEOFDIAMONDS","TENOFDIAMONDS", "JOFHEARTS", "QOFHEARTS", "KOFHEARTS", "AOFHEARTS",
                "SIXOFHEARTS","SEVENOFHEARTS","EIGHTOFHEARTS","NINEOFHEARTS","TENOFHEARTS",
                "JOFPEAKS", "QOFPEAKS", "KOFPEAKS", "AOFPEAKS", "SIXOFPEAKS","SEVENOFPEAKS","EIGHTOFPEAKS","NINEOFPEAKS","TENOFPEAKS"};
        String[] card = new String[4];
        boolean exit = true;
        int temp = 0;
        Random r = new Random();
        for (int i = 0;i< card.length;i++){
            while(exit) {
                String str = deckList[r.nextInt(deckList.length)];
                String checkStr = null;
                if(str != checkStr){
                    checkStr = str;
                }
                for (int j = 0; j < card.length; j++) {
                    if(str != card[j]){
                        card[j] = str;
                        temp++;
                        System.out.println(temp);
                    }
                }
                if(temp == 4){
                    exit = false;
                }
            }
            for (String element: card) {
                System.out.println(element);
            }
        }

        //return deckList[new Random().nextInt(deckList.length)];
    }
}
