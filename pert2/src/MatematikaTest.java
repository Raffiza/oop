class Matematika{
    private double hasil;
    public double jumlah(double a, double b){
        hasil = a + b;
        return hasil;
    }

    public double kurang(double a, double b){
        hasil = a - b;
        return hasil;
    }

    public double kali(double a, double b){
        hasil = a * b;
        return hasil;
    }

    public double bagi(double a, double b){
        hasil = a / b;
        return hasil;
    }
}
public class MatematikaTest{
    public static void main(String [] args){

        double a = 100.0; double b = 3.0;
        double hasilJumlah, hasilKurang, hasilKali, hasilBagi;

        Matematika hitung = new Matematika();
        hasilJumlah = hitung.jumlah( a, b );
        hasilKurang = hitung.kurang( a, b );
        hasilKali = hitung.kali( a, b );
        hasilBagi = hitung.bagi( a, b );

        System.out.println("\nPROGRAM DEMO OPERASI MATEMATIKA");
        System.out.println("-------------------------------\n");
        System.out.println("Penjumlahan " + a + " + " + b + " = " + hasilJumlah);
        System.out.println("\nPengurangan " + a + " - " + b + " = " + hasilKurang);
        System.out.println("\nPerkalian " + a + " x " + b + " = " + hasilKali);
        System.out.println("\nPembagian " + a + " / " + b + " = " + hasilBagi);
    }
}
