package innerclass;


public class Luar{
    int varLuar;
    void cetakLuar(){
        System.out.println("cetak luar...");;
    }

    class Dalam{
        int varDalam;
        void cetakDalam(){
            varLuar = 10;
            cetakLuar();
            System.out.println("cetak dalam...");
        }

        class Terdalam implements InterfaceDalam{
            int varTerdalam;
            public void cetakTerdalam(){
                System.out.println("cetak terdalam...");
            }
        }
    }
}