package tablicewielowymiarowe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class zd2 {
    public static void main(String[] args) {
        int[][][][] array = new int[3][3][3][3];
        int value2 = 0;
        for (
                int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int n = 0; n < 3; n++) {
                    for (int m = 0; m < 3; m++) {
                        array[i][j][n][m] = value2;
                        value2 += 3;
                        System.out.print("[" + i + "][" + j + "][" + n + "][" + m + "] = " + array[i][j][n][m] + "\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}