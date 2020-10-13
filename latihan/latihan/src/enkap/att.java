package enkap;

class Player{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    private int damageTaken;
    private boolean isAlive;

    private Armor armor;
    private Weapon weapon;
    


    public Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public void display(){
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.getHealth() + "/" +  this.MaxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
        System.out.println("Alive\t\t: " + this.isAlive + "\n");
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    private void levelUp(){
        this.level++;
    }

    public int MaxHealth(){
        return this.baseHealth + this.level*this.incrementHealth + this.armor.getAddHealth();
    }

    private int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.weapon.getAttack();
    }

    private String getName(){
        return this.name;
    }

    private int getHealth(){
        return this.MaxHealth() - this.damageTaken;
    }

    public void attacking(Player enemy){
        int damage = this.getAttackPower();
        System.out.println(this.name + " attacking " + enemy.getName() + " for " + damage);
        enemy.defence(damage);
        this.levelUp();
    }

    private void defence(int damage){
        int defensePower = this.armor.getDefensePower();
        int deltaDamage;

        System.out.println(this.getName() + " defense power is " + defensePower);
        
        if(damage > defensePower){
            deltaDamage = damage - defensePower;
        }
        else{
            deltaDamage = 0;
        }

        System.out.println("damage taken is " + deltaDamage + "\n");
        this.damageTaken += deltaDamage;

        if (this.getHealth() <= 0){
            this.isAlive = false;
            this.damageTaken = this.MaxHealth();
        }
    }

}

class Armor{
    private String name;
    private int defense;
    private int health;

    public Armor(String name, int defense, int health){
        this.name = name;
        this.defense = defense;
        this.health = health;
    }
    
    public int getAddHealth(){
        return this.defense*10 + this.health;
    }

    public int getDefensePower(){
        return this.defense*2;
    }


}

class Weapon{
    private String name;
    private int attack;

    public Weapon (String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttack(){
        return this.attack;
    }
}

