public class DemoCasting {
    public static void main(String[] args){

        double nilaiDouble = 3000.56d;
        long m = (long)nilaiDouble;
        int j = (int)m;
        byte x = (byte)j;

        byte nilaiByte = -72;
        int i = (int)nilaiByte;
        long p = (long)i;
        double z = (double)p;

        System.out.println("\nProgram Casting Tipe Data");
        System.out.println("-------------------------\n");

        System.out.println("Narrowing");
        System.out.println("Nilai asli double" + "\t" + nilaiDouble);
        System.out.println("Proses narrowing long" + "\t" + m);
        System.out.println("Proses narrowing int" + "\t" + j);
        System.out.println("Proses narrowing byte" + "\t" + x);

        System.out.println("\nWidening");
        System.out.println("Nilai asli byte" + "\t" + nilaiByte);
        System.out.println("Proses widening long" + "\t" + i);
        System.out.println("Proses widening int" + "\t" + p);
        System.out.println("Proses widening byte" + "\t" + z);
    }
}
