package CaseStudies.ParkingLot.Controllers;

import CaseStudies.ParkingLot.Controllers.dtos.IssueRequestDTO;
import CaseStudies.ParkingLot.Controllers.dtos.IssueResponseDTO;
import CaseStudies.ParkingLot.Controllers.dtos.ResponseStatus;
import CaseStudies.ParkingLot.Models.Ticket;
import CaseStudies.ParkingLot.Services.TicketService;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    IssueResponseDTO issueTicket(IssueRequestDTO issueRequestDto) {
        IssueResponseDTO response=new IssueResponseDTO();
        Ticket ticket;
        try{
            ticket = ticketService.issueTicket(issueRequestDto.getVehicleNo(), issueRequestDto.getSupportedVehicleType(),
                    issueRequestDto.getVehicleOwnerName(), issueRequestDto.getGateID());
        }
        catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            return response;
        }
        response.setTicket(ticket);
        response.setResponseStatus(ResponseStatus.SUCCESS);
        return response;

    }
}
