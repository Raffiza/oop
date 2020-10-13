public class DemoBreak {
    public static void main (String[] args){
        int counter = 0;

        System.out.println("\nProgram Demo Break");
        System.out.println("------------------\n");

        while (counter < 100){
            counter++;
            if (counter == 7){
                break;
            }
        }
        System.out.println("Counter terakhir adalah : " + counter);
    }
}
