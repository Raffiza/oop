public class KenaikanGaji{

// Mendeklarasikan variabel-variabel
private double gajiPokok; 
private double persenNaik; 
private String jabatan; 
private String noPegawai;
/**Method konstruktor yang akan menginisialisasi variabel*/ 
public KenaikanGaji( String noPegawai, String jabatan, double gajiPokok, double persenNaik){
    this.noPegawai = noPegawai;
    this.jabatan = jabatan; 
    this.gajiPokok = gajiPokok; 
    this.persenNaik = persenNaik;
}

/**Nethod yang mengembalikan besar gaji baru*/
public double getGajiBaru(){
    double gajiBaru = gajiPokok + (persenNaik/100)* gajiPokok; 
    return gajiBaru;
}

/**Method yang mengembalikan no ID pegawai*/ 
public String getNoPegawai(){
    return noPegawai;
}

/**Method yang mengembalikan jabatan*/ 
public String getJabatan(){
    return jabatan;

}

}