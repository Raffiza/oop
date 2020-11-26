package lat;

public class Test {
    public static void main(String[] args) {
        // Pegawai pgw;
        String output = "";

        Direktur d = new Direktur("Wahyu", 12000000.00, 7500000.00);
        Manajer m = new Manajer("Tuti", 5000000.00);
        BuruhLepas bL = new BuruhLepas("Suryati", 3500.00, 103);

        // pgw = d;

        System.out.println("\nDemo inheritansi, enkap, polimorfi");
        System.out.println("----------------------------------\n");

        System.out.println(
            "nama : " + d.getNamaPeg() + "\n" +
            "jabatan : " + d.jabatan() + "\n" + 
            "gaji : " + d.gajiPerbulan() + "\n" +
            "dividen : " + d.labaDividen() + "\n" +
            "total : " + d.income()
        );

        System.out.println(
            "nama : " + m.getNamaPeg() + "\n" +
            "jabatan : " + m.jabatan() + "\n" + 
            "gaji : " + m.income()
        );

        System.out.println(
            "nama : " + bL.getNamaPeg() + "\n" +
            "jabatan : " + bL.jabatan() + "\n" + 
            "gaji : " + bL.income()
        );

    }
}
