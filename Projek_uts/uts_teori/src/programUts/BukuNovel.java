package programUts;

class BukuNovel extends Buku{
    private String Judul;

    BukuNovel(double harga,int jumHalaman, String Judul){
        super(harga,jumHalaman);
        this.Judul = Judul;
    }

    public String getJudul(){
        return this.Judul;
    }

    public void setJudul(String Judul){
        this.Judul = Judul;
    }


}
