package nomor1;

public class Bangunan extends Produk{
    private boolean penukaran;
    Bangunan(double harga, double berat, boolean cat, boolean penukaran){
        super(harga, berat,cat);
        this.setPenukaran(penukaran);
    }

    public void Display(){
        super.Display();
        System.out.println("Penukaran  : " + this.getPenukaran());
    }

    public boolean getPenukaran(){
        return this.penukaran;
    }

    public void setPenukaran(boolean penukaran){
        this.penukaran = penukaran;
    }
}

final class Pintu extends Bangunan{
    private double panjang,lebar,tinggi;
    private String bahan;
    Pintu(double harga, double berat, boolean cat, boolean penukaran, double panjang, double lebar, double tinggi, String bahan){
        super(harga, berat,cat, penukaran);
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
        this.setBahan(bahan);
    }

    public void Display(){
        System.out.println("Data produk pintu\n==============");
        super.Display();
        System.out.println("Panjang    : " + this.getPanjang());
        System.out.println("Lebar      : " + this.getLebar());
        System.out.println("Tinggi     : " + this.getTinggi());
        System.out.println("Bahan      : " + this.getBahan());
        System.out.println();
    }

    public double getPanjang(){
        return this.panjang;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public double getLebar(){
        return this.lebar;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public double getTinggi(){
        return this.tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public String getBahan(){
        return this.bahan;
    }

    public void setBahan(String bahan){
        this.bahan = bahan;
    }
}

final class Lantai extends Bangunan{
    private double panjang,lebar;
    private String jenis;
    Lantai(double harga, double berat, boolean cat, boolean penukaran, double panjang, double lebar, String jenis){
        super(harga, berat, cat, penukaran);
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setJenis(jenis);
    }

    public void Display(){
        System.out.println("Data produk lantai\n==============");
        super.Display();
        System.out.println("Panjang    : " + this.getPanjang());
        System.out.println("Lebar      : " + this.getLebar());
        System.out.println("Jenis      : " + this.getJenis());
        System.out.println();
    }

    public double getPanjang(){
        return this.panjang;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public double getLebar(){
        return this.lebar;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}


