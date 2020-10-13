package nomor9;

import java.util.Scanner;


public class ConversionTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int c;
        System.out.println("Program Konversi Suhu");
        System.out.print("Masukkan nilai celcius untuk salah satu objek : ");
        c = input.nextInt();

        Conversion konversi1 = new Conversion();
        Conversion konversi2 = new Conversion(c);

        System.out.println("Nilai suhu : ");
        System.out.println("Konversi 1 : " + konversi1.degreeC);
        System.out.println("Konversi 2 : " + konversi2.degreeC);
        System.out.println("==========================");

        System.out.println("Celcius ke Fahrenheit :");
        System.out.println("Konversi 1 : " + konversi1.cToF());
        System.out.println("Konversi 2 : " + konversi2.cToF());

        System.out.println("Celcius ke Kelvin :");
        System.out.println("Konversi 1 : " + konversi1.cToK());
        System.out.println("Konversi 2 : " + konversi2.cToK());

        System.out.println("Celcius ke Reamur :");
        System.out.println("Konversi 1 : " + konversi1.cToR());
        System.out.println("Konversi 2 : " + konversi2.cToR());
        System.out.println("==========================");

        double cel = (double)konversi1.degreeC;
        double cel2 = (double)konversi2.degreeC;
        System.out.println("Celcius ke Fahrenheit (double) :");
        System.out.println("Konversi 1 : " + konversi1.cToF(cel));
        System.out.println("Konversi 2 : " + konversi2.cToF(cel2));

        System.out.println("Celcius ke Kelvin (double) :");
        System.out.println("Konversi 1 : " + konversi1.cToK(cel));
        System.out.println("Konversi 2 : " + konversi2.cToK(cel2));

        System.out.println("Celcius ke Reaumur (double) :");
        System.out.println("Konversi 1 : " + konversi1.cToR(cel));
        System.out.println("Konversi 2 : " + konversi2.cToR(cel2));


    }

}
