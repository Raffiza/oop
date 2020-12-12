public class MainProgram {
    public static void main(String[] args) {
        Nasabah nasabah1 = new Nasabah();
        Nasabah nasabah2 = new Nasabah();

        Rekening rekening1 = new Rekening();
        Rekening rekening2 = new Rekening();

        nasabah1.setNama("Budi");
        nasabah1.setNoKTP("26666");

        nasabah2.setNama("Tono");
        nasabah2.setNoKTP("39000");

        //awal
        System.out.println("Status awal rekening nasabah \n==============================");
        nasabah1.buatRekening(rekening1, 50000);
        nasabah2.buatRekening(rekening2, 10000);

        nasabah1.display(rekening1);
        nasabah2.display(rekening2);

        //ambil 
        System.out.println("\n");
        nasabah1.ambilUang(rekening1, 20000);
        nasabah1.display(rekening1);
        
        //nabung
        System.out.println("\n");
        nasabah1.nabungUang(rekening1, 40000);
        nasabah1.display(rekening1);

        //transfer
        System.out.println("\n");
        nasabah1.transfer(rekening1, rekening2, 50000);
        nasabah1.display(rekening1);

        //akhir
        System.out.println("\nStatus akhir rekening nasabah \n==============================");
        nasabah1.display(rekening1);
        nasabah2.display(rekening2);
    }
}
