package CaseStudies.ParkingLot.Controllers.dtos;


import CaseStudies.ParkingLot.Models.VehicleType;

public class IssueRequestDTO {
    private String vehicleNo;
    private VehicleType supportedVehicleType;
    private String vehicleOwnerName;
    private Long gateID;

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

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public Long getGateID() {
        return gateID;
    }

    public void setGateID(Long gateID) {
        this.gateID = gateID;
    }


}
