public class DemoWhile {
    public static void main (String[] args){
        int counter = 0;

        System.out.println("\nProgram Demo While");
        System.out.println("------------------\n");

        while (counter <= 5){
            System.out.println("Mencetak counter ke-" + counter);
            ++counter;
        }
    }

}
