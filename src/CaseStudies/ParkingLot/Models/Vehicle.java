package CaseStudies.ParkingLot.Models;

public class Vehicle extends BaseModel {
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(VehicleType supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String vehicleNo;
    private VehicleType supportedVehicleType;
    private String owner;

    public Vehicle(String vehicleNo, VehicleType supportedVehicleType, String vehicleOwnerName) {
        this.vehicleNo=vehicleNo;
        this.supportedVehicleType=supportedVehicleType;
        this.owner=vehicleOwnerName;
    }
}
