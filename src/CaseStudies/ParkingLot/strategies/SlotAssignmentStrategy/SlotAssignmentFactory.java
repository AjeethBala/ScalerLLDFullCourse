package CaseStudies.ParkingLot.strategies.SlotAssignmentStrategy;

import CaseStudies.ParkingLot.Models.SlotAllotmentStrategyType;

public class SlotAssignmentFactory {
    public static  SlotAssignmentStrategy assignSlotByType(SlotAllotmentStrategyType type){
        if(type.equals(SlotAllotmentStrategyType.RANDOM)) {
            return new RandomSlotAssignmentStrategy();
        }
       return null;
    }
}
