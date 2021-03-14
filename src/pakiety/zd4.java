package pakiety;


    class Employe {
        private int Nr;
        private String imie;
        private int wiek;

        public int getId() {
            return Nr;
        }

        public void setNr(int Nr) {
            this.Nr = Nr;
        }

        public String getName() {
            return imie;
        }

        public void setName(String name) {
            this.imie = name;
        }

        public int getAge() {
            return wiek;
        }

        public void setAge(int age) {
            this.wiek = age;
        }
    }

     class privateExample {
        public static void main(String[] args) {

            Employe e = new Employe();
            e.setNr(899);
            e.setName("Maciek");
            e.setAge(19);
            System.out.println("NrDomu: " + e.getId() + " " + "Imie: " + e.getName() + " " + "Wiek: " + e.getAge());
        }
    }
