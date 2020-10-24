package nomor2;

class Pecahan {
    private int pembilang;
    private int penyebut;

    Pecahan(int pembilang, int penyebut){
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public int getPembilang(){
        return this.pembilang;
    }

    public void setPembilang(int pembilang){
        this.pembilang = pembilang;
    }

    public int getPenyebut(){
        return this.penyebut;
    }

    public void setPenyebut(int penyebut){
        this.penyebut = penyebut;
    }

    public void tambah (Pecahan p){
        int hasilPembilang = this.getPembilang() * p.getPenyebut() + p.getPembilang() * this.getPenyebut();
        int hasilPenyebut = this.getPenyebut()*p.getPenyebut(); 
        System.out.println(this.getPembilang() + "/" + this.getPenyebut() + " + "
                            + p.getPembilang() + "/" + p.getPenyebut() + " : "
                            + hasilPembilang + "/" + hasilPenyebut);
    }
}
