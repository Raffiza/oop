import java.util.Date;

public final class Car extends Vehicle {
    private Feature[] feature = new Feature[10]; 
    private int carAxle;

    Car(){
        super();
        Feature[] f = {
            new ExteriorFeature("No feature"),
            new InteriorFeature("No feature")
        };
        this.feature = f;
        this.carAxle = 2;

    }

    public Car(String vehicleManufacturer,
                Date vehicleManufacturedDate,
                String vehicleMake, String vehicleModel,
                String vehicleType,
                Chassis vehicleFrame,
                Engine vehicleEngine,
                Feature[] feature,
                int carAxle) {
        super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame, vehicleType, vehicleEngine);
        this.feature = feature;
        this.carAxle = carAxle;
    }

    public String getExteriorfeature(){
        String list = "";
        for (int i = 0;i<this.feature.length;i++){
            if (this.feature[i] instanceof ExteriorFeature){
                if (list.length() == 0) {
                    list += this.feature[i];
                } else {
                    list += "\n : " + this.feature[i];
                }
            }
        }
        return list;
    }


    public String getInteriorfeature(){
        String list = "";
        for (int i = 0;i<this.feature.length;i++){
            if (this.feature[i] instanceof InteriorFeature){
                if (list.length() == 0) {
                    list += "\t\t: " + this.feature[i];
                } else {
                    list += "\n\t\t\t: " + this.feature[i];
                }
            }
        }
        return list;
    }

    public String toString() {
                String list = "";
                for (int i = 0; i < this.feature.length; i++) {
                    if (list.length() == 0) {
                        list += "\t\t: " + this.feature[i];
                    } else {
                        list += "\n\t\t\t: " + this.feature[i];
                    }
                }
                return super.toString() + "\n"
                        + "Features" + list + "\n"
                        + "Car Axle\t\t: " + carAxle;
            }

    public static void main(String[] args) {
        Feature[] f = {new InteriorFeature("AM/FM Radio"), new ExteriorFeature("Wood Panels"), new InteriorFeature("Air Conditioning"), new ExteriorFeature("Moonroof")};
        Car car1 = new Car();
        Car car2 = new Car("Honda", new Date(1325599999999L), "Honda", "Prelude", "Coupe", new VehicleChassis("Unibody"), new ManufacturedEngine("Honda", new Date(), "H-series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive"),
                f, 2);

        System.out.println(car1);
        System.out.println("================");
        System.out.println(car2);
    }
}
