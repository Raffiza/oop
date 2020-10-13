public class MamaliaDarat{
    public static void main(String[] args){
        String suaraHewan = "";
        System.out.println("\nDEMO KELAS, METHOD DAN DATA");
        System.out.println("---------------------------\n");

        Kucing pussy = new Kucing("Joni","m");
        suaraHewan = pussy.mengeong();
        pussy.view();
        System.out.println("Suara : " + suaraHewan);

        Anjing doggy = new Anjing("budi","f");
        suaraHewan = doggy.menggonggong();
        doggy.view();
        System.out.println("Suara : " + suaraHewan);

        Macan siKumbang = new Macan("ea","m");
        suaraHewan = siKumbang.mengaum();
        siKumbang.view();
        System.out.println("Suara : " + suaraHewan);
    }
}
class Kucing {
    String nama;
    String gender;

    Kucing(String nama, String gender){
        this.nama = nama;
        this.gender = gender;
    }

    void view(){
        System.out.println("===============");
        System.out.println("nama : " + nama );
        System.out.println("gender : "+ gender);
    }
    public String mengeong() {
        String suara = new String("Meoong...");
        return suara;
    }
}
class Anjing{
    String nama;
    String gender;

    Anjing(String nama, String gender){
        this.nama = nama;
        this.gender = gender;
    }

    void view(){
        System.out.println("===============");
        System.out.println("nama : " + nama );
        System.out.println("gender : "+ gender);
    }
    public String menggonggong() {
        String suara = new String("Guk..Guk...");
        return suara;
    }
}
class Macan {
    String nama;
    String gender;

    Macan(String nama, String gender){
        this.nama = nama;
        this.gender = gender;
    }

    void view(){
        System.out.println("===============");
        System.out.println("nama : " + nama );
        System.out.println("gender : "+ gender);
    }
    public String mengaum() {
        String suara = new String("Auummm...");
        return suara;
    }
}
