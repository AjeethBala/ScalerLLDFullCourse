package CaseStudies.ParkingLot.Repositories;

import CaseStudies.ParkingLot.Models.Gate;
import CaseStudies.ParkingLot.Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long,ParkingLot> parkingLotMap=new HashMap<>();
    public  ParkingLot getParkingLotByGate(Gate gate){
        for(ParkingLot parkingLot:parkingLotMap.values()){
            if(parkingLot.getGates().contains(gate)){
                return parkingLot;
            }
        }
        return  null;
    }
}