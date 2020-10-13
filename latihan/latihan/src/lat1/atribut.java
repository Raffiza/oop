package lat1;

class Player{
    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    Player (String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player enemy){
        double damage = this.weapon.damage;
        System.out.println(this.name + " attack " + enemy.name);
        enemy.defence(damage);
        System.out.println();

    }

    void defence(double damage){
        if (this.armor.defense < damage){
            damage = damage - this.armor.defense;
            this.health -= damage;
        }
        else{
            damage = 0;
        }
        System.out.println(this.name + " recieve " + damage + " damage");

    }

    void EquipWeapon (Weapon weapon){
        this.weapon = weapon;
    }

    void EquipArmor (Armor armor){
        this.armor = armor;
    }

    void Display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health);
        this.weapon.Display();
        this.armor.Display();
        System.out.println();
    }

}

class Weapon{
    String name;
    double damage;

    Weapon (String name, double damage){
        this.name = name;
        this.damage = damage;
    }
    
    void Display(){
        System.out.println("Weapon : " + this.name + ", damage : " + this.damage);
    }

}

class Armor{
    String name;
    double defense;

    Armor (String name, double defense){
        this.name = name;
        this.defense = defense;
    }
    void Display(){
        System.out.println("Armor : " + this.name + ", defense : " + this.defense);
    }

    
}