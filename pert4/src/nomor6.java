import java.util.Scanner;

public class nomor6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("masukkan angka : "); angka = input.nextInt();

        for (int i = 1; i<=angka; i++){
            if (i == 1 || i == angka ){
                for (int a = 1; a <= angka; a++){
                    System.out.print("*");
                }
            }
            else{
                for (int b = 1; b <= angka; b++){
                    if (b == 1 || b == angka){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
