package CaseStudies.ParkingLot.Controllers;

import CaseStudies.ParkingLot.Controllers.dtos.IssueRequestDTO;
import CaseStudies.ParkingLot.Controllers.dtos.IssueResponseDTO;
import CaseStudies.ParkingLot.Models.Ticket;
import CaseStudies.ParkingLot.Services.TicketService;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    IssueResponseDTO issueTicket(IssueRequestDTO issueRequestDto) {
        Ticket ticket = ticketService.issueTicket(issueRequestDto.getVehicleNo(), issueRequestDto.getSupportedVehicleType(),
                issueRequestDto.getVehicleOwnerName(), issueRequestDto.getGateID());
        return null;
    }
}
