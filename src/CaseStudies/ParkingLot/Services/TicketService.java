package CaseStudies.ParkingLot.Services;

import CaseStudies.ParkingLot.Exceptions.GateNotFoundException;
import CaseStudies.ParkingLot.Models.*;
import CaseStudies.ParkingLot.Repositories.GateRepository;
import CaseStudies.ParkingLot.Repositories.ParkingLotRepository;
import CaseStudies.ParkingLot.Repositories.TicketRepository;
import CaseStudies.ParkingLot.Repositories.VehicleRepository;
import CaseStudies.ParkingLot.strategies.SlotAssignmentStrategy.SlotAssignmentFactory;
import CaseStudies.ParkingLot.strategies.SlotAssignmentStrategy.SlotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private  GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(
        String vehicleNo,
        VehicleType supportedVehicleType,
        String vehicleOwnerName,
        Long gateID
    ) throws GateNotFoundException {
        //create ticket object
        Ticket ticket=new Ticket();
        ticket.setEntryTime(new Date());

        //create a gate object using repo amd setup gate object
        Optional<Gate> gateOptional=gateRepository.getGateById(gateID);

        if(gateOptional.isEmpty()){
            throw new GateNotFoundException();
        }
        Gate gate=gateOptional.get();
        ticket.setGeneratedat(gate);
        ticket.setGeneratedby(gate.getOperator());

        //vehicle setup==>if already exists in vehicle db set it orelse
        //create a new vehicle object save it  and set it
        Optional<Vehicle> vehicleOptional= vehicleRepository.getVehicleByNumber(vehicleNo);
        Vehicle savedVehicle;
        if(vehicleOptional.isEmpty()){
            Vehicle vehicle=new Vehicle(vehicleNo,supportedVehicleType,vehicleOwnerName);
            savedVehicle=vehicleRepository.saveVehicle(vehicle);
        }
        else{
            savedVehicle=vehicleOptional.get();
        }
        ticket.setVehicle(savedVehicle);


        //assign a slot to vehicle
        ParkingLot parkingLot= parkingLotRepository.getParkingLotByGate(gate);
        SlotAllotmentStrategyType slotAllotmentStrategyType=parkingLot.getSlotAllotmentStrategyType();
        SlotAssignmentStrategy slotAssignmentStrategy =SlotAssignmentFactory.assignSlotByType(slotAllotmentStrategyType);

        ticket.setAssignedSlot(slotAssignmentStrategy.assignSlot(gate,supportedVehicleType));

        Ticket savedTicket = ticketRepository.saveTicket(ticket);
        ticket.setNumber("Ticket"+ savedTicket.getId());
        //return ticket object
        return ticket;
    }
}
