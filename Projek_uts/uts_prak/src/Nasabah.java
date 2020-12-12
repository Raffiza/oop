class Nasabah extends Rekening {
    private String nama;
    private String noKTP;


    public void setNama(String n){
        this.nama = n;
    }

    public void setNoKTP(String ktp){
        this.noKTP = ktp;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNoKTP(){
        return this.noKTP;
    }

    public void buatRekening(Rekening r, int setoran){
        r.setNoRekening(this.noKTP);
        r.setSaldo(setoran);
    }

    public void ambilUang(Rekening r, int ambil){
        r.setSaldo(r.getSaldo() - ambil);
        System.out.println(this.getNama() + " mengambil uang sebesar " + ambil);
    }

    public void nabungUang(Rekening r, int nabung){
        r.setSaldo(r.getSaldo() + nabung);
        System.out.println(this.getNama() + " menabung uang sebesar " + nabung);
    }

    public void transfer(Rekening r1, Rekening r2, int jumlah){
        r1.setSaldo(r1.getSaldo() - jumlah );
        r2.setSaldo(r2.getSaldo() + jumlah);
        System.out.println(this.getNama() + " melakukan transfer ke no.rekening " + r2.getNoRekening() + " sebesar " + jumlah);
    }

    public void display(Rekening r){
        System.out.println("\nSaldo rekening " + r.getNoRekening() + " milik " + this.getNama() + " : " + r.getSaldo() + "\n");
    }


}
