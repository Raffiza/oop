public class KonversiSuhuTest {
    public static void main(String [] args){
        double suhuCelcius = 37.0;
        double suhuFahrenheit = 145.0;
        double hasilCelcius, hasilFahrenheit;

        KonversiSuhu suhu = new KonversiSuhu();
        hasilCelcius = suhu.toFahrenheit(suhuCelcius);
        hasilFahrenheit = suhu.toCelcius(suhuFahrenheit);

        System.out.println("\nPROGRAM KONVERSI SUHU");
        System.out.println("-------------------------------\n");
        System.out.println("Celcius ke Fahrenheit : " + suhuCelcius + " jadi " + hasilCelcius);
        System.out.println("Fahrenheit ke Celcius : " + suhuFahrenheit + " jadi " + hasilFahrenheit);
    }
}
