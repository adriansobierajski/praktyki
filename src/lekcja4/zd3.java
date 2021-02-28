package lekcja4;
import java.util.Scanner;
public class zd3 {
    public static void main(String[] args) {
        // poprawny login: maciek
        // poprawne hasło: dlugiepole
        Scanner login = new Scanner(System.in);
        System.out.println("Podaj login: ");
        String log = login.next();
        Scanner haslo = new Scanner(System.in);
        System.out.println("Podaj haslo: ");
        String has = haslo.next();
        if (log.equals("maciek") && has.equals("dlugiepole")){
            System.out.println("Witaj w systemie:)");
        }
        else {
            System.out.println("zły login lub hasło.");
        }
    }
}
