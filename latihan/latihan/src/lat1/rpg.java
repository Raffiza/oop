package lat1;
public class rpg {
    public static void main(String[] args) {
       Player player1 = new Player("budi", 100);
       Player player2 = new Player("sena", 50);

       Weapon sword = new Weapon("sword", 20);
       Weapon dagger = new Weapon("dagger", 40);

       Armor plate = new Armor("plate", 15);
       Armor leather = new Armor("leather", 5);

       player1.EquipWeapon(sword);
       player1.EquipArmor(plate);

       player2.EquipWeapon(dagger);
       player2.EquipArmor(leather);

       player1.Display();
       player2.Display();

       player1.attack(player2);
       player1.Display();
       player2.Display();

       player2.attack(player1);
       player1.Display();
       player2.Display();
    }
}

