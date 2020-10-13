import java.util.Scanner;

class DemoIfElse {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        double nilaiInput;

        System.out.println("\nProgram Demo If Else");
        System.out.println("--------------------\n");

        System.out.print("Masukkan Nilai [0 - 100] : ");
        nilaiInput = s.nextDouble();

        if ((nilaiInput < 0) | (nilaiInput > 100)){
            System.out.println("Data input invalid !");
        }

        else{
            if (nilaiInput >= 60){
                System.out.println("\nSelamat, anda lulus mata " + "kuliah ini.");
                if (nilaiInput >= 85){
                    System.out.println("\nNilai anda : A");
                }
                else if (nilaiInput >= 70){
                    System.out.println("\nNilai anda : B");
                }
                else if (nilaiInput >= 60){
                    System.out.println("\nNilai anda : C");
                }
                else{
                    System.out.println("\nMaaf, anda harus mengulang " +
                                        "mata kuliah ini kembali, atau" +
                                        "mengikuti ujian perbaikan dengan " +
                                        "nilai maksimum C");
                }
            }
        }
    }

}
