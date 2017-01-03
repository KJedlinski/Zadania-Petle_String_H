package Zadanie6;

import java.util.Scanner;

/**
 * Created by krystian on 03.01.17.
 */
public class Zad6Main {
    public static void main(String[] args) {

        String text;
        Scanner sc = new Scanner(System.in);

        System.out.print("Wprowadź jakiś napis: ");
        text = sc.nextLine().trim();
        sc.close();

        int counter = 0;
        int length = text.length();

        for (int i = 0; i < length; i++){
            if((text.codePointAt(i) >= 97) && (text.codePointAt(i) <= 122))
                counter++;
        }

        System.out.println("W napisie: " + "'" + text + "'" + " małe litery występują " + counter + " razy.");

    }
}
