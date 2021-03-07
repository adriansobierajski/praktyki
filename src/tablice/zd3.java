package tablice;
import java.util.Random;
public class zd3 {
    public static void main(String[] args) {
        String imiona[] = {"maciek", "jhonny", "billy"};
        Random rand = new Random();
        int piez = rand.nextInt(imiona.length);
        System.out.println("losowe imie psa=" +imiona[piez]);

    }
}