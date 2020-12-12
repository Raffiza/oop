package programUts;

class Buku {
    private double harga;
    private int jumHalaman;

    Buku(double harga, int jumHalaman){
        this.harga = harga;
        this.jumHalaman = jumHalaman;
    }

    public void setHarga(double harga){
        this.harga = harga;
    } 

    public double getHarga(){
        return this.harga;
    }

    public void setjumHalaman(int jumHalaman){
        this.jumHalaman = jumHalaman;
    }

    public int getjumHalaman(){
        return this.jumHalaman;
    }
}
