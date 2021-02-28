package lekcja4;
import java.util.Scanner;
public class zd4 {
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
        if (raz < dwa && dwa < trzy) {
            System.out.println("kolejność rosnąca:)");
        } else {
            if (trzy < dwa && dwa < raz) {
                System.out.println("kolejność malejąca:)");
            }
            else {
                System.out.println("brak kolejności:)");
            }
        }
    }
}
