import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ManufacturedEngine implements Engine {
    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;

    ManufacturedEngine(){
        this.engineManufacturer = "Generic";

        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        this.engineManufacturedDate = new Date();
        try {
            this.engineManufacturedDate = sd.parse("02-02-2012 00:55:44");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        this.engineMake = "Generic";
        this.engineModel = "Generic";
        this.engineType = "85 AKI";
        this.engineCylinders = 0;
        this.driveTrain = "2WD: Two-Wheel Drives";
    }

    ManufacturedEngine(String engineManufacturer,Date engineManufacturedDate,String engineMake,String engineModel,int engineCylinders,String engineType, String driveTrain){
        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineCylinders = engineCylinders;
        this.engineType = engineType;
        this.driveTrain = driveTrain;
    }

    public void setEngineCylinders(int engineCylinders){
        this.engineCylinders = engineCylinders;
    }

    public void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    public void setEngineManufacturer(String manufacturer){
        this.engineManufacturer = manufacturer;
    }

    public void setEngineMake(String engineMake){
        this.engineMake = engineMake;
    }

    public void setEngineModel(String engineModel){
        this.engineModel = engineModel;
    }

    public void setDriveTrain (String driveTrain){
        this.driveTrain = driveTrain;
    }

    public void setEngineType(String fuel){
        this.engineType = fuel;
    }

    public String toString(){
        return "Engine Manufacturer\t: " + this.engineManufacturer + "\n"
                + "Engine Manufactured\t: " + this.engineManufacturedDate + "\n"
                + "Engine Make\t\t: " + this.engineMake + "\n"
                + "Engine Model\t\t: " + this.engineModel + "\n"
                + "Engine Type\t\t: " + this.engineType + "\n"
                + "Engine Cylinders\t: " + this.engineCylinders + "\n"
                + "Drive Train\t\t: " + this.driveTrain;
    }

    public static void main(String[] args) {
        String input = "03-01-2012 07:13:19";
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Date date = null;
        try {
            date = sd.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //nomor5
        ManufacturedEngine engine1 = new ManufacturedEngine();
        ManufacturedEngine engine2 = new ManufacturedEngine("Honda", date, "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drives");

        System.out.println(engine1);
        System.out.println(engine2);
    }
}
