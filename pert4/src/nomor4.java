import java.util.Scanner;

public class nomor4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka;
        int a;
        int hasil = 0;
        boolean bol = true;

        System.out.println("Mencetak hitungan bilangan bulat");
        System.out.println("Masukkan angka (diakhiri dengan -99) : ");

        while (true){
            angka = input.nextInt();
            if (angka == -99){
                break;
            }
            else{
                hasil = hasil + angka;
            }

        }
        System.out.println("Hasil = " + hasil);

    }
}
