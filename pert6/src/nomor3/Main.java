package nomor3;

public class Main {
    public static void main(String[] args) {
        GameOop wiro_sableng = new GameOop("wiro sableng", 20, 10);
        GameOop gundala = new GameOop("gundala", 25, 5);

        //eps 1
        wiro_sableng.tendang(gundala);
        gundala.tendang(wiro_sableng);

        //eps 2
        for (int i = 0;i<3;i++){
            gundala.pukul(wiro_sableng);
        }

        for (int i = 0;i<4;i++){
            wiro_sableng.tendang(gundala);
        }

        wiro_sableng.Display();
        gundala.Display();

        GameOop.DisplayWinner(wiro_sableng, gundala);
    }
}
