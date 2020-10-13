import java.util.Scanner;

public class nomor10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c,jawaban;
        double rata;
        boolean bol = true;
        String pilih;
        KalkulatorSederhana kalkulator = new KalkulatorSederhana();

        System.out.println("Selamat datang di program fungsi matematis.");
        while (true){
            System.out.println("Fungsi yang dapat anda lakukan antara lain :");
            System.out.println("1. Pertambahan");
            System.out.println("2. Rata - Rata");
            System.out.println("3. Pangkat");
            System.out.println("0. Keluar");
            System.out.print("Silahkan masukkan pilihan anda : ");
            pilih = input.nextLine();

            if (pilih.equals("1")){
                System.out.println("Masukkan 2 bilangan : ");
                a = input.nextInt();
                b = input.nextInt();
                jawaban = kalkulator.tambah(a,b);
                System.out.println("Nilai adalah : " + jawaban);
            }
            else if (pilih.equals("2")){
                System.out.println("Masukkan 3 bilangan : ");
                a = input.nextInt();
                b = input.nextInt();
                c = input.nextInt();
                rata = kalkulator.rataRata(a,b,c);
                System.out.println("Rata-rata adalah : " + rata);
            }
            else if (pilih.equals("3")){
                System.out.println("Masukkan 2 bilangan (angka dan pangkatnya) :");
                a = input.nextInt();
                b = input.nextInt();
                jawaban = kalkulator.pangkat(a,b);
                System.out.println("Nilai " + a + "^" + b + " adalah : " + jawaban);
            }
            else if (pilih.equals("0")){
                break;
            }
            else {
                System.out.println("Maaf, angka yang anda masukkan tidak terdapat dalam pilihan (tekan enter) ");
            }
            pilih = input.nextLine();
        }

    }
}

class KalkulatorSederhana{

    int tambah(int a, int b){
        int hasil = a + b;
        return hasil;
    }

    double rataRata(int a, int b, int c){
        double x = (double) a;
        double y = (double) b;
        double z = (double) c;
        double hasil = (x + y + z)/3;
        return hasil;
    }
    int pangkat (int a, int b){
        int hasil = 1;
        for (int i = 1; i <= b; i++){
            hasil = hasil*a;
        }
        return hasil;
    }
}
