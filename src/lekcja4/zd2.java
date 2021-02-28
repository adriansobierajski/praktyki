package lekcja4;

import java.util.Scanner;

public class zd2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int raz = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int dwa = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int trzy = c.nextInt();
        if (raz == dwa) {
            System.out.println("Pierwsza liczba=druga.");
        }
        if (dwa == trzy) {
            System.out.println("Druga liczba=trzecia.");
        }
        if (raz == trzy) {
            System.out.println("Pierwsza liczba=trzecia.");
        }
        if (raz == dwa && dwa == trzy && raz == trzy){
        }
        else {
            if (raz > dwa) {
                if (raz > trzy)
                    System.out.println("Pierwsza jest największa:)");
            } else {
                if (dwa > trzy) {
                    System.out.println("Druga jest największa:)");
                } else {
                    System.out.println("Trzecia jest największa:)");
                }
            }
        }
    }
}