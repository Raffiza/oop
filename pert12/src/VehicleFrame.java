public class VehicleFrame implements Chassis{
    private String vehicleFrameType;

    VehicleFrame(){
        this.vehicleFrameType = "Unibody";
    }

    VehicleFrame(String vehicleFrameType){
        this.vehicleFrameType = vehicleFrameType;
    }

    public Chassis getChassisType(){
        return this;
    }

    public void setChassisType(String vehicleFrameType){
        this.vehicleFrameType = vehicleFrameType;
    }

    public String toString(){
        if(this.vehicleFrameType == "Unibody"){
            return "Chassis\t\t: " + chassis + "\nVehicle Frame\t: " + this.getChassisType();
        }
        else{
            return "Vehicle Frame\t: " + this.getChassisType();
        }
    }

    public static void main(String[] args) {
         //nomor4
         VehicleFrame frame1 = new VehicleFrame();
         VehicleFrame frame2 = new VehicleFrame("Ladder Frame");
 
         System.out.println(frame1.toString());
         System.out.println(frame2.toString());
         System.out.println("===================\n");
    }
}
