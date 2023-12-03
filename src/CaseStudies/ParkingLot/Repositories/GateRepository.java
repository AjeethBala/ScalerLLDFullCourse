package CaseStudies.ParkingLot.Repositories;

import CaseStudies.ParkingLot.Models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    //Save gate using list or hashmap with ID
    private Map<Long,Gate> gates=new HashMap<>();

    public Optional<Gate> getGateById(Long gateID){
        if(gates.containsKey(gateID)){
            return Optional.of(gates.get(gateID));
        }
        return Optional.empty();
    }


}
