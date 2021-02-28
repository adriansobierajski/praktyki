package lekcja4;
import java.util.Scanner;
public class zd1 {
    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int liczba = podaj.nextInt();
        if (liczba == 0) {
            System.out.println("liczba równa 0 :)");
        } else {
            if (liczba > 0) {
                System.out.println("liczba większa od 0 :)");
            } else {
                if (liczba < 0) {
                    System.out.println("liczba mniejsza od 0 :)");
                }
            }
        }
    }
}