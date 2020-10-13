class DemoShorcutOperator {
    public static void main(String[] args){
        int a = 2, hasil;
        System.out.println("\nProgra  Demo Shortcut Operator");
        System.out.println("------------------------------\n");

        System.out.println("Nilai awal a = " + a);


        a += 3;
        System.out.println("\nShortcut Operator a += 3 " + "menghasilkan : " + a);


        a *= 3;
        System.out.println("\nShortcut Operator a *= 3 " + "menghasilkan : " + a);


        System.out.println("\nNilai variabel a sebelum " + "PostIncremental = " + a);
        hasil = 3*(a++);
        System.out.println("Hasil PostIncremental 3*(a++) = " + hasil);
        System.out.println("Nilai variabel a setelah " + "PostIncremental = " + a);


        System.out.println("\nNilai variabel a sebelum " + "PretIncremental = " + a);
        hasil = 3*(++a);
        System.out.println("Hasil PreIncremental 3*(++a) = " + hasil);
        System.out.println("Nilai variabel a setelah " + "PreIncremental = " + a);


        System.out.println("\nNilai variabel a sebelum " + "Postdecremental = " + a);
        hasil = 3*(a--);
        System.out.println("Hasil Postdecremental 3*(a--) = " + hasil);
        System.out.println("Nilai variabel a setelah " + "Postdecremental = " + a);

        System.out.println("\nNilai variabel a sebelum " + "Predecremental = " + a);
        hasil = 3*(--a);
        System.out.println("Hasil Predecremental 3*(a--) = " + hasil);
        System.out.println("Nilai variabel a setelah " + "Predecremental = " + a);
    }
}
