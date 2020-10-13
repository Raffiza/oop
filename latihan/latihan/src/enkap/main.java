package enkap;

public class main {
    public static void main(String[] args) {
        Player player1 = new Player("Marni");
        Armor armor1 = new Armor("Baju besi",5,100);
        Weapon weapon1 = new Weapon("Pedang", 10);

        Player player2 = new Player("Budi");
        Armor armor2 = new Armor("Kaos",1,50);
        Weapon weapon2 = new Weapon("Meriam", 50);

        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attacking(player2);
        player1.display();
        player2.display();

        player2.attacking(player1);
        player1.display();
        player2.display();

        player1.attacking(player2);
        player1.display();
        player2.display();


    }
}
