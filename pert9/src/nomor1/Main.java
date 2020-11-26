package nomor1;

public class Main {
    public static void main(String[] args) {
        Pasir pasir = new Pasir(5000, 10, false, true, "pasir putih", "putih");
        pasir.Display();
        Kayu kayu = new Kayu(20000, 5, true, true, 50, 5, 6);
        kayu.Display();
        Semen semen = new Semen(15000, 3, false, true, "3 roda");
        semen.Display();


        Pintu pintu = new Pintu(10000, 50, true, false, 45, 5, 200, "mahoni");
        pintu.Display();
        Lantai lantai = new Lantai(20000, 1.5 , true, false, 20, 20, "KW1");
        lantai.Display();

        System.out.println("jumlah produk yang ada : " + Produk.getJumlah());
        System.out.println("harga total : " + Produk.getTotalHarga());
        
    }
}
