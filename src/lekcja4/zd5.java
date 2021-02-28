package lekcja4;
import java.util.Scanner;
public class zd5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę: ");
        double x = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Podaj 2 liczbę: ");
        double y = b.nextInt();
        Scanner działanie = new Scanner(System.in);
        System.out.println("Wybierz działanie (+,-,*,/): ");
        char wybór = działanie.next().charAt(0);
        switch (wybór) {
            case '+':
                double plus = x + y;
                System.out.println("Wynik dodawania: "+ plus +" :)");
                break;
            case '-':
                double minus = x - y;
                System.out.println("Wynik odejmowania: "+ minus+ " :)");
                break;
            case '*':
                double razy = x * y;
                System.out.println("Wynik mnożenia: "+ razy+ " :)");
                break;
            case '/':
                double dzielenie = x / y;
                System.out.println("Wynik dzielenia: "+ dzielenie+ " :)");
                break;
            default:
                System.out.println("Nie wybrano żadnego działania :(");
                break;

        }
    }
}
