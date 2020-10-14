import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double motor;
        double potong = 0.05;
        double cicilan;
        String pilih;

        System.out.print("Harga motor : "); 
        motor = input.nextDouble();

        input.nextLine();

        System.out.print("bayar tunai (y/n) : "); 
        pilih = input.nextLine();

        if (pilih.equals("y")){
            motor -= (potong*motor);
            System.out.println("harga jual : " + motor);
        }
        else if (pilih.equals("n")){
            cicilan = motor/10;
            System.out.println("cicilan perbulan : " + cicilan);
        }
    }
}
