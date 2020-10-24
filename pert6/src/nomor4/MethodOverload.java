package nomor4;

class MethodOverload {

    public void kuadrat(int a){
        System.out.println("Method kuadrat pertama");
        System.out.println("Hasil kuadrat " + a + " adalah : " + (a*a));
    }

    public void kuadrat(double a){
        System.out.println("Method kuadrat kedua");
        System.out.println("Hasil kuadrat " + a + " adalah : " + (a*a));
    }
}
