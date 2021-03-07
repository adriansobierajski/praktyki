package pętle;

public class zd3 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " runda");
            for (int j = 1; j < 11; j++) {
                int x = i * j;
                if (x % 2 == 0) {
                    System.out.println(" [i:" + i + "]" + "[j:" + j + "]\t " + i + " * " + j + " = " + x + "\t");

                }
                else {
                    System.out.println(" [i:" + i + "]" + "[j:" + j + "]\t " + i + " * " + j + " = X"+"\t");
                }
            }
        }
    }
}
