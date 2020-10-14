package nomor5;

class Time {
    int h,m,s;
    String diff;

    Time(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void toUniversalString(){
        //Lebih singkat dibanding di pdf
        if (this.h < 0 || this.h >= 24){
            this.h = 0;
        }

        if (this.m < 0 || this.m >= 60){
            this.m = 0;
        }

        if (this.s < 0 || this.s >= 60){
            this.s = 0;
        }

    }

    void toStrings (){
        if (this.h > 0 && this.h <= 12){
            this.diff = "AM";
        }
        else if (this.h == 0){
            this.diff = "AM";
            this.h = 12;
        }
        else{
            this.diff = "PM";
            this.h = this.h % 12;
        }

        System.out.println(this.h + ":" + this.m + ":" + this.s + " " + this.diff);

    }
}
