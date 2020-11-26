package lat;

public class BuruhLepas extends Pegawai{
    private double upah;
    private double jam;
    
    public BuruhLepas(String nama, double u, double j){
        super(nama);
        setUpah(u);
        setJam(j);
    }

    public void setUpah(double u){
        if (u > 0){
            upah = u;
        }
        else{
            upah = 0;
        }
    }

    public void setJam(double j){
        if (j >= 0 && j < 176){
            jam = j;
        }
        else{
            jam = 0;
        }
    }

    @Override
    public String getNamaPeg(){
        return "nama : " + super.getNamaPeg();
    }

    public String jabatan(){
        return "buruh lepas";
    }

    public double income(){
        return upah * jam;
    }
}
