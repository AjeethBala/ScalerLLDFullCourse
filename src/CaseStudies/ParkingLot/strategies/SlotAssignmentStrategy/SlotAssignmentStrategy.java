package CaseStudies.ParkingLot.strategies.SlotAssignmentStrategy;

import CaseStudies.ParkingLot.Models.*;

public interface SlotAssignmentStrategy {
     ParkingSlot assignSlot(Gate gate, VehicleType vehicleType);
}
