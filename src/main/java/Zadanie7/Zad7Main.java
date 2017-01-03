package Zadanie7;

import java.util.Scanner;

/**
 * Created by krystian on 03.01.17.
 */
public class Zad7Main {
    public static void main(String[] args) {

        long number;
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj jakąś liczbę całkowitą: ");
        number = sc.nextLong();
        sc.close();

        for (long i = 2; i <= (number / 2); i++) {
            if (number % i == 0)
                counter++;
        }

        if (number > 1)
            counter += 2; //Ponieważ pętla pomija stałe dzielniki: liczbę 1 i liczbę badaną
        else
            counter = 1;


        System.out.println("Liczba " + number + " ma " + counter + " dzielników.");
    }
}
