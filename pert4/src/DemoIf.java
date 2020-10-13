import java.util.Scanner;

public class DemoIf {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        double nilaiInput;

        System.out.println("\nProgram Demo If");
        System.out.println("---------------\n");

        System.out.print("Masukkan Nilai [0 - 100] : ");
        nilaiInput = s.nextDouble();

        if (nilaiInput >= 60)
            System.out.println("\nSelamat, anda lulus mata kuliah ini.");
    }
}
