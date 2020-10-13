package nomor9;

class Conversion {
    int degreeC;

    Conversion(){
        degreeC = 0;
    }
    Conversion(int celcius){
        degreeC = celcius;
    }

    int cToF(){
        int f = (degreeC*(9/5)) + 32;
        return f;
    }
    int cToK(){
        int k = degreeC + 273;
        return k;
    }
    int cToR(){
        int r = degreeC*(4/5);
        return r;
    }
    double cToF(double degreeC){
        double f = (degreeC*1.8) +32;
        return f;
    }
    double cToK(double degreeC){
        double k = degreeC + 273;
        return k;
    }
    double cToR(double degreeC){
        double r = degreeC*0.8;
        return r;
    }
}

