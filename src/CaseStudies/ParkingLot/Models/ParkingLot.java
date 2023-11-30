package CaseStudies.ParkingLot.Models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloors> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> vehicleTypes;
    private  ParkingLotStatus parkingLotStatus;
    private SlotAllotmentStrategyType slotAllotmentStrategyType;
    private  FeeCalculateStrategyType feeCalculateStrategyType;

    public List<ParkingFloors> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloors> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SlotAllotmentStrategyType getSlotAllotmentStrategyType() {
        return slotAllotmentStrategyType;
    }

    public void setSlotAllotmentStrategyType(SlotAllotmentStrategyType slotAllotmentStrategyType) {
        this.slotAllotmentStrategyType = slotAllotmentStrategyType;
    }

    public FeeCalculateStrategyType getFeeCalculateStrategyType() {
        return feeCalculateStrategyType;
    }

    public void setFeeCalculateStrategyType(FeeCalculateStrategyType feeCalculateStrategyType) {
        this.feeCalculateStrategyType = feeCalculateStrategyType;
    }
}
