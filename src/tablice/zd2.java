package tablice;
import java.util.Arrays;
import java.util.Collections;
public class zd2 {
    public static void main(String[] args) {
        String[] stringArray = {"w","a","b","c","y","z","m","n","e","g"};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sortowanie malejące: " + Arrays.toString(stringArray));
    }
}
