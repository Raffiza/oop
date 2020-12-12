import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Vehicle implements Engine, Chassis{
    private Date vehicleManufacturedDate;
    private String vehicleManufacturer;
    private String vehicleMake;
    private String vehicleModel;
    private Chassis vehicleFrame;
    private String vehicleType;
    private String driveTrain;
    private Engine vehicleEngine;

    Vehicle(){
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        this.vehicleManufacturedDate = new Date();
        try {
            this.vehicleManufacturedDate = sd.parse("02-02-2015 01:38:31");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.vehicleManufacturer = "Generic";
        this.vehicleMake = "Generic";
        this.vehicleModel = "Generic";
        this.vehicleFrame = new VehicleFrame();
        this.vehicleType = "None";
        this.driveTrain = "2WD: Two-Wheel Drive";
        this.vehicleEngine = new ManufacturedEngine();
        this.vehicleEngine.setEngineType("88 AKI");
        this.vehicleEngine.setDriveTrain(driveTrain);
        
    }

    Vehicle(Date vehicleManufacturedDate,
            String vehicleManufacturer,
            String vehicleMake,
            String vehicleModel,
            Chassis vehicleFrame,
            String vehicleType,
            Engine vehicleEngine){
        this.vehicleManufacturedDate = vehicleManufacturedDate;
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleFrame = vehicleFrame;
        this.vehicleType = vehicleType;
        this.vehicleEngine = vehicleEngine;
    }

    public void setEngineCylinders (int engineCylinders){
        this.vehicleEngine.setEngineCylinders(engineCylinders);
    }

    public void setEngineManufacturedDate (Date date){
        this.vehicleEngine.setEngineManufacturedDate(date);
    }
    public void setEngineManufacturer (String manufacturer){
        this.vehicleEngine.setEngineManufacturer(manufacturer);
    }
    public void setEngineMake (String engineMake){
        this.vehicleEngine.setEngineMake(engineMake);
    }
    public void setEngineModel (String engineModel){
        this.vehicleEngine.setEngineModel(engineModel);
    }
    public void setDriveTrain (String driveTrain){
        this.vehicleEngine.setDriveTrain(driveTrain);
    }
    public void setEngineType (String fuel){
        this.vehicleEngine.setEngineType(fuel);
    }

    public Chassis getChassisType() {
        return this.vehicleFrame;
    }

    public void setChassisType(String vehicleChassis){
        this.vehicleFrame.setChassisType(vehicleChassis);
    }

    public String toString(){
        return "Manufacturer Name\t: " + this.vehicleManufacturer + "\n"
                + "Manufactured Date\t: " + this.vehicleManufacturedDate + "\n"
                + "Vehicle Make\t\t: " + this.vehicleMake + "\n"
                + "Vehicle Model\t\t: " + this.vehicleModel + "\n"
                + "Vehicle Type\t\t: " + this.vehicleType + "\n"
                + vehicleEngine.toString();
    }

    public static void main(String[] args) {
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Date vehicledate = null;
        Date enginedate = null;
        try {
            vehicledate = sd.parse("03-01-2012 07:13:19");
            enginedate = sd.parse("02-01-2012 01:38:31");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Nomor9
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(vehicledate, "Honda", "Honda", "Prelude", new VehicleFrame("Long Bar"), "null", 
                                new ManufacturedEngine("Honda", enginedate, "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive"));
                                
        System.out.println(v1);
        System.out.println(v2);
    }
}
