public class DemoContinue {
    public static void main (String[] args){
        int counterDiabaikan = 0;

        System.out.println("\nProgram Demo Continue");
        System.out.println("---------------------\n");

        for (int counter = 1; counter <= 5; counter++){
            if (counter == 3){
                counterDiabaikan = counter;
                continue;
            }
            else {
                System.out.println("Mencetak counter ke-" + counter);
            }
        }
        System.out.println("\nPerulangan telah dihentikan " +
                            "oleh 'continue' pada counter ke : " +
                            counterDiabaikan);
    }
}
