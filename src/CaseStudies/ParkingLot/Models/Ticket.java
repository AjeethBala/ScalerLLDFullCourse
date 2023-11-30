package CaseStudies.ParkingLot.Models;

import java.util.Date;

public class Ticket extends BaseModel{
    private int number;
    private Vehicle vehicle;
    private Date entryTime;
    private ParkingSlot assignedSlot;
    private  Gate generatedat;
    private  Operator generatedby;

}
