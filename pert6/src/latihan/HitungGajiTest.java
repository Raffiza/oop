import java.text.DecimalFormat;

public class HitungGajiTest {
    public static void main(String[] args) {
        // Mengeset tampilan hasil menjadi dua digit desimal 
        DecimalFormat digitPresisi = new DecimalFormat("0.00"); 
        System.out.println("\nDEMO ENKAPSULAPSI"); 
        System.out.println("-----------------\n"); 
// Membuat instans dari kelas hitungGaji untuk suatu // pegawai, dan memanggil method+methodnya. 
        HitungGaji tony = new HitungGaji(); 
        tony.setGaji(2500000); 
        tony.hitungGaji(); 
        System.out.println("Informasi Gaji Pegawai"); 
        System.out.println("\nBesar Gaji kotor : " + digitPresisi.format( tony.getGajiKotor() )); 
        System.out.println("\nBesar Gaji yang dibawa pulang : " + digitPresisi.format(tony.getGajiBersih())); 

    }
}
