import java.util.Scanner;
import java.lang.Math;

public class nomor8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a,b,c;
        HypotenuseCalculation hypotenuse = new HypotenuseCalculation();
        System.out.println("Menghitung panjang sisi miring segitiga ");
        System.out.print("Masukkan nilai a : "); a = input.nextDouble();
        System.out.print("Masukkan nilai b : "); b = input.nextDouble();
        c = hypotenuse.hitung(a,b);
        System.out.print("Panjang sisi c : " + c);
    }

}

class HypotenuseCalculation {
    double hasil;

    double hitung (double a, double b){
        hasil = Math.pow((a*a) + (b*b) , 0.5);
        return hasil;
    }
}
