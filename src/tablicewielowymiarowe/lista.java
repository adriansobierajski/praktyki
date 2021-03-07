package tablicewielowymiarowe;
import java.util.ArrayList;
import java.util.Collections;

public class lista {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int value = 0;
//        for(int i =0; i<5; i++){
//            for(int j= 0; j<5; j++){
//                arr[i][j] = value;
//                value++;
//                value++;
//                value++;
//                value++;
//                value++;
//                System.out.println(arr[i][j]);
//            }
//
//        }
//        int value2=0;
//        int[][][][] czter = new int[3][3][3][3];
//        for(int i =0; i<3; i++){
//            for(int j= 0; j<3; j++){
//                for(int k=0;k<3;k++){
//                    for(int l=0;l<3;l++){
//                        czter[i][j][k][l] = value2;
//                        value2+=4;
//                        value++;
//
//                        System.out.println("["+i+"]["+j+"]["+l+"]["+l+"}"+ czter[i][j][k][l]+"\t");
//                    }
//                }
//
//            }
//
//        }
        ArrayList<String> lista = new ArrayList<>();
        lista.add("deodorant");
        lista.add("olej");
        lista.add("liga");
        lista.add("maciek");
        System.out.println("Lista główna: \t"+ lista);

        lista.add("clorox");
        lista.add("wałek");
        System.out.println("Lista po dodaniu: \t"+ lista);

        lista.add(1,"wiertło");
        System.out.println("Lista po dodaniu obiektu w dane miejsce: \t"+lista);

        lista.remove("olej");
        lista.remove(3);
        System.out.println("Lista po odjęciu: \t"+lista);

        lista.set(0,"amortyzator");
        System.out.println("Lista po zmianie: \t"+lista);

        Collections.sort(lista);
        System.out.println("Lista po sortowaniu: \t"+lista);

        lista.clear();
        System.out.println("Lista po wyczyszczeniu: \t"+lista);
    }

}
