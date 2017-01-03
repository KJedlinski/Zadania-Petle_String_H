package Zadanie5;

import java.util.Scanner;

/**
 * Created by krystian on 02.01.17.
 */
public class Zad5Main {
    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj proszę swoje imię: ");
        name = sc.next().trim().toLowerCase();
        sc.close();

        if (name.endsWith("a"))
            System.out.println("Wygląda na to, że jesteś kobietą.");
        else
            System.out.println("Wygląda na to, że jesteś facetem.");
    }
}
