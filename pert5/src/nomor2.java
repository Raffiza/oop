import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama_panjang;

        System.out.print("Masukkan nama anda : " ); nama_panjang = input.nextLine();
        
        String[] namesplit = nama_panjang.split(" ",3);

        System.out.println("nama awal anda " + namesplit[0]);


    }
}
