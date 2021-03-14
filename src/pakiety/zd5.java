package pakiety;

public class zd5 {
    public static class Vehicle {
        protected final int PojemoscBaku = 100;
        protected int IloscPaliwa = 75;

        public void fillTank() {
            int dolewka = PojemoscBaku - IloscPaliwa;
            fillTank(dolewka);
        }

        public void fillTank(int dolewka){
            if (dolewka + IloscPaliwa > PojemoscBaku){
                System.out.println("Nie można wypelnic baku " + dolewka + " Litrami.");
            }
            else{
                IloscPaliwa += dolewka;
                System.out.println("Wypelniono bak " + dolewka + " L.");
            }
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Pojemność : " + vehicle.PojemoscBaku + " L.");
        System.out.println("ilość paliwa: " + vehicle.IloscPaliwa + " L.");
        vehicle.fillTank();
        System.out.println("ilość paliwa: " + vehicle.IloscPaliwa + " L.");
        vehicle.fillTank(10);

    }

}
