package CaseStudies.ParkingLot.Repositories;

import CaseStudies.ParkingLot.Models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    private Map<String,Vehicle> vehicleMap=new HashMap<>();
    public Optional<Vehicle> getVehicleByNumber(String VehicleNumber){
        if(vehicleMap.containsKey(VehicleNumber)){
            return Optional.of(vehicleMap.get(VehicleNumber));
        }
        return Optional.empty();

    }
    public Vehicle saveVehicle(Vehicle vehicle){
        for(Vehicle vehicle1:vehicleMap.values()){
            if(vehicle1.equals(vehicle)){
                return vehicle1;
            }
        }
        vehicleMap.put(vehicle.getVehicleNo(),vehicle);
        return  vehicle;
    }
}
