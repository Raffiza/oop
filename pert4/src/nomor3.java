import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.println("Mencetak bilangan bulat dari n sampai 1");
        System.out.print("Masukkan angka : "); angka = input.nextInt();

        for (int i = angka; i>=1; i--){
            System.out.println(i);
        }
    }
}
