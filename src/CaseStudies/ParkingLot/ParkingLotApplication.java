package CaseStudies.ParkingLot;

import CaseStudies.ParkingLot.Controllers.TicketController;
import CaseStudies.ParkingLot.Repositories.GateRepository;
import CaseStudies.ParkingLot.Repositories.ParkingLotRepository;
import CaseStudies.ParkingLot.Repositories.TicketRepository;
import CaseStudies.ParkingLot.Repositories.VehicleRepository;
import CaseStudies.ParkingLot.Services.TicketService;

public class ParkingLotApplication {
    public static void main(String[] args) {
        GateRepository gateRepository=new GateRepository();
        ParkingLotRepository parkingLotRepository=new ParkingLotRepository();
        TicketRepository ticketRepository=new TicketRepository();
        VehicleRepository vehicleRepository=new VehicleRepository();

        TicketService ticketService=new TicketService(gateRepository,vehicleRepository,parkingLotRepository,ticketRepository);

        TicketController ticketController=new TicketController(ticketService);

        System.out.println("APPLICATION IS READY");

    }
}
