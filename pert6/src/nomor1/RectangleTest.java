package nomor1;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;
        String c;

        System.out.println("Constructor 1\n==============");
        Rectangle rectangle1 = new Rectangle();
        rectangle1.hitungKeliling();
        rectangle1.hitungLuas();

        System.out.println("\nConstructor 2\n==============");
        System.out.print("Masukkan nilai : "); a = input.nextDouble();
        Rectangle rectangle2 = new Rectangle(a);
        rectangle2.hitungKeliling();
        rectangle2.hitungLuas();

        input.nextLine();

        System.out.println("\nConstructor 3\n==============");
        System.out.print("Masukkan nilai panjang dan lebar (2 angka dipisahkan dengan spasi): ");c = input.nextLine();
        Rectangle rectangle3 = new Rectangle(c);
        rectangle3.hitungKeliling();
        rectangle3.hitungLuas();

        System.out.println("\nConstructor 4\n==============");
        System.out.print("Masukkan nilai panjang : ");a = input.nextDouble();
        System.out.print("Masukkan nilai lebar : ");b = input.nextDouble();
        Rectangle rectangle4 = new Rectangle(a,b);
        rectangle4.hitungKeliling();
        rectangle4.hitungLuas();

        System.out.println("\nConstructor 1 (Mengganti nilai panjang) \n==============");
        System.out.print("Masukkan nilai panjang yang baru : "); a = input.nextDouble();
        rectangle1.panjang = a;
        rectangle1.hitungKeliling();
        rectangle1.hitungLuas();
    }
}
