package tablice;
import java.util.Random;

public class zd4 {
    public static void main(String[] args) {
        String[] jedzenie = {"schabowy","kawa","naleśniki","ryż","Jajecznica","Tosty","rosół"};
        Random x = new Random();
        int śniadanie = x.nextInt(jedzenie.length);
        int obiad = x.nextInt(jedzenie.length);
        int kolacja = x.nextInt(jedzenie.length);

        System.out.println("śniadanie= "+jedzenie[śniadanie]+", obiad= "+jedzenie[obiad]+", kolacja= "+jedzenie[kolacja]);
    }
}
