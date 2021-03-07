package obiekty;

public class piec {
    interface piekarnik {
        void Chleb();
        void Ciasto();
    }
    interface Grill{
        void Kurczak();
    }
    public static class Piece implements piekarnik,Grill {
        private int temp;
        private int czas;

        @Override
        public void Chleb() {
            temp = 180;
            czas = 100;
            wlaczPiec();
        }

        @Override
        public void Ciasto() {
            temp = 155;
            czas = 177;
            wlaczPiec();
        }

        @Override
        public void Kurczak() {
            temp = 100;
            czas = 179;
            wlaczPiec();
        }

        private void wlaczPiec() {
            System.out.println("Włączamy piec " +
                    "na  : " +
                    temp + " stopni celsiusza, " + "time na: " +
                    czas + " sekund");
        }

        public static void main(String[] args) {
            Piece Piece = new Piece();
            Grill Grill=Piece;
            piekarnik piekarnik=Piece;

            piekarnik.Chleb();
            piekarnik.Ciasto();
            Grill.Kurczak();

        }
    }
}
