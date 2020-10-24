package nomor1;



class Rectangle {
    double panjang;
    double lebar;

    Rectangle(){
        this.panjang = 0;
        this.lebar = 0;
    }

    Rectangle(double a){
        this.panjang = a;
        this.lebar = a;
    }

    Rectangle(String a){
        String[] angka = a.split(" ",2);
        double x = Double.parseDouble(angka[0]);
        double y = Double.parseDouble(angka[1]);
        this.panjang = x;
        this.lebar = y;
    }

    Rectangle(double a, double b){
        this.panjang = a;
        this.lebar = b;
    }

    void hitungKeliling(){
        double hasil = (this.panjang*2) + (this.lebar*2);
        System.out.println("Keliling : " + hasil);
    }

    void hitungLuas(){
        double hasil = this.panjang * this.lebar;
        System.out.println("Luas : " + hasil);
    }
}
