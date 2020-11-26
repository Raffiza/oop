package nomor1;

public class Produk {
    private double harga;
    private double berat;
    private boolean cat;
    private static int jumlahProduk;
    private static double hargaTotal;

    Produk(double harga, double berat, boolean cat){
        this.setHarga(harga);
        this.setBerat(berat);
        this.setCat(cat);
        Produk.jumlahProduk += 1;
        Produk.hargaTotal += harga;
    }

    public void Display(){
        System.out.println("Harga      : " + this.getHarga());
        System.out.println("Berat      : " + this.getBerat());
        System.out.println("Bisa dicat : " + this.getCat());
    }

    public double getHarga(){
        return this.harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public double getBerat(){
        return this.berat;
    }
    
    public void setBerat(double berat){
        this.berat = berat;
    } 

    public boolean getCat(){
        return this.cat;
    }

    public void setCat(boolean cat){
        this.cat = cat;
    }

    public static int getJumlah(){
        return Produk.jumlahProduk;
    }

    public static double getTotalHarga(){
        return Produk.hargaTotal;
    }
}
