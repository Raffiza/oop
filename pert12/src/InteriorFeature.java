public class InteriorFeature implements Feature{
    private String interiorFeature;

    InteriorFeature(){
        this.interiorFeature = "Generic";
    }

    InteriorFeature(String interorFeature){
        this.interiorFeature = interorFeature;
    }

    public String getFeature(){
        return this.interiorFeature;
    }

    public void setFeature(String interiorFeature){
        this.interiorFeature = interiorFeature;
    }

    public String toString(){
        return "Interior [" + this.getFeature() + "]";
    }

    public static void main(String[] args) {
        //nomor7
        InteriorFeature interior1 = new InteriorFeature();
        InteriorFeature interior2 = new InteriorFeature("Climate Control");

        System.out.println(interior1.toString());
        System.out.println(interior2.toString());
        System.out.println("===================\n");
    }
}


