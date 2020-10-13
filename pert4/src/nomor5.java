import java.util.Scanner;

public class nomor5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("masukkan angka : "); angka = input.nextInt();

        for (int i = 1; i<=angka; i++){
            for (int j = 1 ; j <= angka; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
