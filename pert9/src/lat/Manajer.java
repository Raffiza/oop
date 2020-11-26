package lat;

public final class Manajer extends Pegawai{
    private double gajiManajer;

    public Manajer(String nama, double gaji){
        super(nama);
        setGajiManajer(gaji);
    }

    public void setGajiManajer(double gaji){
        if (gaji > 0){
            gajiManajer = gaji;
        }
        else{
            gajiManajer = 0;
        }
    }

    public String getNamaPeg(){
        return "nama : " + super.getNamaPeg();
    }

    public String jabatan(){
        return "manajer";
    }

    public double income(){
        return gajiManajer;
    }
}
