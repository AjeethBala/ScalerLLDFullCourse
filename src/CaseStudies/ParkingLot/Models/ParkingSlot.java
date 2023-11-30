package CaseStudies.ParkingLot.Models;

import java.util.List;

public class ParkingSlot extends  BaseModel{
    private  int slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private List<VehicleType> vehicleTypes;
    private  ParkingFloors parkingFloors;
}
