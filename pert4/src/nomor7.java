import java.util.Scanner;

public class nomor7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka;
        boolean bol = true;

        System.out.print("masukkan angka : "); angka = input.nextInt();

        for (int i = 1; i<=angka; i++){
            if (bol == true){
                for(int a = 1; a <= angka; a++){
                    System.out.print("*");
                    bol = false;
                }
            }
            else{
                for (int b = 1; b <= angka + 1; b++){
                    if (b == 1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                        bol = true;
                    }
                }
            }
            System.out.println();
        }
    }
}
