import java.util.Scanner;

public class nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        System.out.print("Masukkan angka : "); angka = input.nextInt();
        
        int fib[] = new int[angka];
 
        for (int i = 0; i < angka; i++){
            if (i == 0 || i == 1){
                fib[i] = i;
                System.out.print(fib[i] + " ");
            }
            else{
                fib[i] = fib[i-1] + fib[i-2];
                System.out.print(fib[i] + " ");
            }
        }



        
    }
    
}
