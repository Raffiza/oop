class DemoOperasiBit {
    public static void main(String[] args){
        byte x = 65;
        int y = 5;
        int hasilNot, hasilAnd, hasilOr, hasilXor;

        System.out.println("\nDemo Operasi Bitwise Integer");
        System.out.println("----------------------------\n");

        hasilNot = 0;
        hasilAnd = 0;
        hasilOr = 0;
        hasilXor = 0;

        hasilNot = ~x;
        hasilAnd = x & y;
        hasilOr = x | y;
        hasilXor = x ^ y;

        System.out.println("Hasil Negasi : " + x + " = " + hasilNot);
        System.out.println("Hasil Konjungsi : " + x + " & " + y + " = " + hasilAnd);
        System.out.println("Hasil Disjungsi : " + x + " | " + y + " = " + hasilOr);
        System.out.println("Hasil XOR : " + x + " ^ " + y + " = " + hasilXor);

    }
}
