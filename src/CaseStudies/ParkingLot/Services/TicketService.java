package CaseStudies.ParkingLot.Services;

import CaseStudies.ParkingLot.Models.Gate;
import CaseStudies.ParkingLot.Models.Ticket;
import CaseStudies.ParkingLot.Models.VehicleType;
import CaseStudies.ParkingLot.Repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    GateRepository gateRepository;
    public Ticket issueTicket(
        int vehicleNo,
        VehicleType supportedVehicleType,
        String vehicleOwnerName,
        Long gateID
    ){
        //create ticket object
        Ticket ticket=new Ticket();
        ticket.setEntryTime(new Date());

        //create a gate object using repo amd setup gate object
        Optional<Gate> gateOptional=gateRepository.getGateById(gateID);

//        if(gateOptional.){
//
//        }
//        ticket.setGeneratedat(gate);



        //assign a slot to vehicle
        //return ticket object
        return null;
    }
}
