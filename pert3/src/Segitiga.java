import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args){
        int a;
        int t;
        double hasil;

        rumus hitung = new rumus();

        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nilai alas : ");
        a = s.nextInt();

        System.out.print("Masukkan nilai tinggi : ");
        t = s.nextInt();

        hasil = hitung.luas(a,t);

        System.out.println("Nilai luas segitiga : " + hasil);
    }
}

class rumus{
    double luas(double x,double y){
        double alas = (double)x;
        double tinggi = (double)y;
        double hasil = (alas*tinggi)/2;
        return hasil;
    }
}

