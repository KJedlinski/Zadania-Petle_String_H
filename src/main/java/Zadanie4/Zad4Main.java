package Zadanie4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by krystian on 02.01.17.
 */
public class Zad4Main {
    public static void main(String[] args) {

        String postalCode;
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj kod pocztowy: ");
        postalCode = sc.nextLine();
        sc.close();

        Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{3}");
        Matcher matcher = pattern.matcher(postalCode);


        if (matcher.matches())
            System.out.println("Kod pocztowy został zakceptowany.");
        else
            System.out.println("Niepoprawny format kodu pocztowego.");
    }
}
