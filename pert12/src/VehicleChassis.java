public class VehicleChassis implements Chassis {
    private String chassisName;
    VehicleChassis(){
        this.setChassisType(Chassis.chassis);
    }

    VehicleChassis(String chassisName){
        this.setChassisType(chassisName);
    }

    public Chassis getChassisType(){
        return this;
    }

    public void setChassisType(String vehicleChassis){
        this.chassisName = vehicleChassis;
    }

    public String toString(){
        return "Chassis Name\t: " + this.chassisName;
    }
    
    public static void main(String[] args) {
        //Nomor 3
        VehicleChassis chassis1 = new VehicleChassis();
        VehicleChassis chassis2 = new VehicleChassis("Jeep");

        System.out.println(chassis1);
        System.out.println(chassis2);
        System.out.println("===================\n");
    }
}
