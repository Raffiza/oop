class KonversiSuhu {
    private double celcius;
    private double fahrenheit;

    public double toFahrenheit(double a){
        fahrenheit = (a * 9/5) + 32;
        return fahrenheit;
    }

    public double toCelcius(double b){
        celcius = (b - 32) * 5 / 9;
        return celcius;
    }
}
