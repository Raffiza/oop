package lat;

public abstract class Pegawai {
    private String namaPeg;

    public Pegawai(String nama){
        namaPeg = nama;
    }

    public String getNamaPeg(){
        return namaPeg;
    }

    public abstract double income();
}
