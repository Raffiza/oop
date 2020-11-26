package innerclass;

public class Main {
    public static void main(String[] args) {
        Luar l = new Luar();
        Luar.Dalam d = l.new Dalam();
        InterfaceDalam t = d.new Terdalam();

        l.cetakLuar();
        d.cetakDalam();
        t.cetakTerdalam();
    }
}
