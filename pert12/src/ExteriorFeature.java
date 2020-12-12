public class ExteriorFeature implements Feature{
    private String exteriorFeature;

    ExteriorFeature(){
        this.exteriorFeature = "Generic";
    }

    ExteriorFeature(String exteriorFeature){
        this.exteriorFeature = exteriorFeature;
    }

    public String getFeature(){
        return this.exteriorFeature;
    }

    public void setFeature(String feature){
        this.exteriorFeature = feature;
    }

    public String toString(){
        return "Exterior [" + this.getFeature() + "]";
    }

    public static void main(String[] args) {
        //nomor8
        ExteriorFeature exterior1 = new ExteriorFeature();
        ExteriorFeature exterior2 = new ExteriorFeature("Fog Lamps");

        System.out.println(exterior1);
        System.out.println(exterior2);
        System.out.println("===================\n");
    }
}
