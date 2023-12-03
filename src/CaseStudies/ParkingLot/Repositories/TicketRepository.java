package CaseStudies.ParkingLot.Repositories;

import CaseStudies.ParkingLot.Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Long,Ticket> tickets=new HashMap<>();
    private  long previousID=0L;
    public Ticket saveTicket(Ticket ticket){
        previousID+=1;
        ticket.setId(previousID);
        tickets.put(previousID,ticket);
        return  null;
    }
}
