package by.academy.homework;

import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int num = 1;
        if (number > 1 && number < 8) { //game from 2 to 7 players
            for (int i = 1; i <= number; i++) {
                System.out.println("Игрок " + num);
                deck();
                num++;
                System.out.println();
            }
        } else {
            System.out.println("game from 2 to 7 players");
        }
    }

    //there are 36 cards in the deck
    public static void deck() {
        String[] deck = {"JOFCLUBS", "QOFCLUBS", "KOFCLUBS", "AOFCLUBS",
                "SIXOFCLUBS", "SEVENOFCLUBS", "EIGHTOFCLUBS", "NINEOFCLUBS", "TENOFCLUBS", "JOFDIAMONDS", "QOFDIAMONDS", "KOFDIAMONDS", "AOFDIAMONDS",
                "SIXOFDIAMONDS", "SEVENOFDIAMONDS", "EIGHTOFDIAMONDS", "NINEOFDIAMONDS", "TENOFDIAMONDS", "JOFHEARTS", "QOFHEARTS", "KOFHEARTS", "AOFHEARTS",
                "SIXOFHEARTS", "SEVENOFHEARTS", "EIGHTOFHEARTS", "NINEOFHEARTS", "TENOFHEARTS",
                "JOFPEAKS", "QOFPEAKS", "KOFPEAKS", "AOFPEAKS", "SIXOFPEAKS", "SEVENOFPEAKS", "EIGHTOFPEAKS", "NINEOFPEAKS", "TENOFPEAKS"};
        String[] card = new String[5];
        Random r = new Random();
        int index;
        for (int i = 0; i < card.length; i++) {
            index = r.nextInt(deck.length);
            card[i] = deck[index];
            System.out.print(card[i] + " ");
        }
    }
}
