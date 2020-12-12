import java.util.Date;

interface Chassis {
    public final String chassis = "Chassis";
    public Chassis getChassisType();
    public void setChassisType(String vehicleChassis);
}

interface Engine {
    public void setEngineCylinders (int engineCylinders);
    public void setEngineManufacturedDate (Date date);
    public void setEngineManufacturer (String manufacturer);
    public void setEngineMake (String engineMake);
    public void setEngineModel (String engineModel);
    public void setDriveTrain (String driveTrain);
    public void setEngineType (String fuel);
}

interface Feature {
    public String getFeature();
    public void setFeature(String feature);
}


