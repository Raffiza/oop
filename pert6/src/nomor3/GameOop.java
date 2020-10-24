package nomor3;

class GameOop{
    private String name;
    private int lifePoint;
    private int powerTendangan;
    private int powerPukulan;

    GameOop(String name, int powerTendangan, int powerPukulan){
        this.name = name;
        this.lifePoint = 100;
        this.powerTendangan = powerTendangan;
        this.powerPukulan = powerPukulan;
    }

    public void tendang(GameOop enemy){
        System.out.println(this.getName() + " menendang " + enemy.getName() + " sebesar " + this.powerTendangan);
        enemy.lifePoint -= this.powerTendangan;
    }

    public void pukul(GameOop enemy){
        System.out.println(this.getName() + " memukul " + enemy.getName() + " sebesar " + this.powerPukulan);
        enemy.lifePoint -= this.powerPukulan;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLifePoint() {
        return this.lifePoint;
    }

    public void Display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Life Point : " + this.lifePoint);
    }

    public static void DisplayWinner(GameOop a, GameOop b){
        if(a.getLifePoint() > b.getLifePoint()){
            System.out.println("\nPemenangnya adalah " + a.getName());
        }
        else{
            System.out.println("\nPemenangnya adalah " + b.getName());
        }
    }
}