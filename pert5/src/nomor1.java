import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        String first_name, middle_name, last_name;

        System.out.print("Masukkan nama depan : "); first_name = input.nextLine();
        System.out.print("Masukkan nama tengah : "); middle_name = input.nextLine();
        System.out.print("Masukkan nama akhir : "); last_name = input.nextLine();

        String nama_panjang = (first_name + " " + middle_name + " " + last_name);

        System.out.println(nama_panjang);

    }
}
