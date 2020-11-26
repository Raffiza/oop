package lat;


public class Direktur extends Pegawai{
    private double gajiDirektur;
    private double divideSaham;

    public Direktur (String nama, double gaji, double dividen){
        super(nama);
        setGajiDirektur(gaji);
        setDividen(dividen);
    }

    public void setGajiDirektur(double gaji){
        if (gaji > 0){
            gajiDirektur = gaji;
        }
        else{
            gajiDirektur = 0;
        }
    }

    public void setDividen(double dividen){
        if (dividen > 0){
            divideSaham = dividen;
        }
        else{
            divideSaham = 0;
        }
    }

    public String getNamaPeg(){
        return "nama : " + super.getNamaPeg();
    }

    public String jabatan(){
        return "direktur";
    }

    public double gajiPerbulan(){
        return gajiDirektur;
    }

    public double labaDividen(){
        return divideSaham;
    }

    public double income(){
        return gajiDirektur * divideSaham;
    }
}
