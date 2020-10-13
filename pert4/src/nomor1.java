import java.util.Scanner;

public class nomor1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int a,b,c;
        int hasil;

        System.out.println("Masukkan angka a"); a = input.nextInt();
        System.out.println("Masukkan angka b"); b = input.nextInt();
        System.out.println("Masukkan angka c"); c = input.nextInt();

        hasil = (b*b) - 4*(a*c);
        System.out.println("Hasil = " + hasil);
    }
}
