package nomor1;

public class Material extends Produk{
    private boolean durabilitas;
    Material(double harga, double berat, boolean cat, boolean durabilitas){
        super(harga, berat,cat);
        this.setDurabilitas(durabilitas);;
    }

    public void Display(){
        super.Display();
        System.out.println("Durabilitas: " + this.getDurabilitas());
    }

    public boolean getDurabilitas(){
        return this.durabilitas;
    }

    public void setDurabilitas(boolean durabilitas){
        this.durabilitas = durabilitas;
    }
}

final class Pasir extends Material{
    private String jenis;
    private String warna;
    Pasir(double harga, double berat, boolean cat,boolean durabilitas, String jenis, String warna){
        super(harga, berat, cat,durabilitas);
        this.setJenis(jenis);
        this.setWarna(warna);
    }

    public void Display(){
        System.out.println("Data produk pasir\n==============");
        super.Display();
        System.out.println("Jenis      : " + this.getJenis());
        System.out.println("warna      : " + this.getWarna());
        System.out.println();
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String getWarna(){
        return this.warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }
}

final class Kayu extends Material{
    private double panjang,lebar,tinggi;
    Kayu(double harga, double berat, boolean cat,boolean durabilitas, double panjang, double lebar, double tinggi){
        super(harga, berat, cat,durabilitas);
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
    }

    public void Display(){
        System.out.println("Data produk kayu\n==============");
        super.Display();
        System.out.println("Panjang    : " + this.getPanjang());
        System.out.println("Lebar      : " + this.getLebar());
        System.out.println("Tinggi     : " + this.getTinggi());
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
}

final class Semen extends Material{
    private String merk;
    Semen(double harga, double berat, boolean cat, boolean durabilitas, String merk){
        super(harga, berat, cat, durabilitas);
        this.setMerk(merk);   
    }

    public void Display(){
        System.out.println("Data produk semen\n==============");
        super.Display();
        System.out.println("merk       : " + this.getMerk());
        System.out.println();
    }

    public String getMerk(){
        return this.merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }
}
