class DemoOperator {
    public static void main(String[] args){
        boolean test = false;

        DemoOperator demo = new DemoOperator();

        test = (demo instanceof DemoOperator);

        String[] namaHari = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

        System.out.println("\nProgram Demo Operator");
        System.out.println("---------------------\n");
        System.out.println("Apakah objek demo merupakan " + "Instans dari DemoOperator ? : " + test);
        System.out.println("\nMencetak hari pertama" + "\t" + namaHari[0]);
        System.out.println("\nMencetak hari keempat" + "\t" + namaHari[3]);

    }
}
