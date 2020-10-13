import java.util.Scanner;

public class DemoSwitchCase {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int pilihan;

        System.out.println("\nProgram Demo Switch Case");
        System.out.println("------------------------\n");

        System.out.print("Masukkan pilihan anda [1-3] : ");
        pilihan = s.nextInt();

        switch (pilihan){
            case  1 :
                System.out.println("\nAnda memilih Tom Cruise.");
                break;
            case 2 :
                System.out.println("\nAnda memilih Jacky Chan.");
                break;
            case 3 :
                System.out.println("\nAnda memilih Van Damme.");
                break;
            default:
                System.out.println("\nHanya pilihan [1-3] yang " + "diperbolehkan.");
        }
    }
}
