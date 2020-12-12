package programUts;

class BukuTulis extends Buku {
    private String Merk;

    BukuTulis(double harga, int jumHalaman, String Merk){
        super(harga, jumHalaman);
        this.Merk = Merk;
    }
    
    public String getMerk(){
        return this.Merk;
    }

    public void setMerk(String Merk){
        this.Merk = Merk;
    }
}
