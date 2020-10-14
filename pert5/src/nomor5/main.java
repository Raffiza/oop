package nomor5;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h,m,s;

        System.out.print("Input jam : "); h = input.nextInt();
        System.out.print("Input menit : "); m = input.nextInt();
        System.out.print("Input detik : "); s = input.nextInt();
        Time time1 = new Time(h,m,s);
        time1.toUniversalString();
        time1.toStrings();
    }
    
}
