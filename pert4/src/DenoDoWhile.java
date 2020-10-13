public class DenoDoWhile {
    public static void main (String[] args){
        int counter =0;

        System.out.println("\nProgram Demo Do..While");
        System.out.println("----------------------\n");

        do{
            System.out.println("Mencetak counter ke-" + counter);
            ++counter;
        }
        while (counter <= 0);
    }
}
