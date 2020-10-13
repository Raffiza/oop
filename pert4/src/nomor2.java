import java.util.Scanner;

public class nomor2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.println("Mencetak bilangan ganjil dari 1 sampai n");
        System.out.print("Masukkan angka : "); angka = input.nextInt();

        for (int i = 1; i<=angka; i++){
            if (i%2 == 0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
