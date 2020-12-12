package programUts;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        
        System.out.println("\nBuku Tulis\n============");
        System.out.print("merk : "); String merk = inp.nextLine();
        System.out.print("harga : "); double harga = inp.nextDouble();
        inp.nextLine();
        System.out.print("jumlah halaman : "); int jumlahhalaman = inp.nextInt();

        BukuTulis buku = new BukuTulis(harga, jumlahhalaman, merk);

        inp.nextLine();

        System.out.println("\nBuku Novel\n============");
        System.out.print("judul : "); String judul = inp.nextLine();
        System.out.print("harga : "); harga = inp.nextDouble();
        inp.nextLine();
        System.out.print("jumlah halaman : "); jumlahhalaman = inp.nextInt();

        BukuNovel novel = new BukuNovel(harga, jumlahhalaman, judul);

        System.out.println("\ndata buku tulis\n========= ");
        System.out.println("merk = " + buku.getMerk());
        System.out.println("harga = " + buku.getHarga());
        System.out.println("jumlah halaman = " + buku.getjumHalaman());

        System.out.println("\ndata buku novel\n========= ");
        System.out.println("judul = " + novel.getJudul());
        System.out.println("harga = " + novel.getHarga());
        System.out.println("jumlah halaman = " + novel.getjumHalaman());
    }
}
