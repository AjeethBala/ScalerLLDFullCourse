package CaseStudies.ParkingLot.Models;

import java.util.Date;

public class Ticket extends BaseModel{
    private String number;
    private Vehicle vehicle;
    private Date entryTime;
    private ParkingSlot assignedSlot;
    private  Gate generatedat;
    private  Operator generatedby;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSlot getAssignedSlot() {
        return assignedSlot;
    }

    public void setAssignedSlot(ParkingSlot assignedSlot) {
        this.assignedSlot = assignedSlot;
    }

    public Gate getGeneratedat() {
        return generatedat;
    }

    public void setGeneratedat(Gate generatedat) {
        this.generatedat = generatedat;
    }

    public Operator getGeneratedby() {
        return generatedby;
    }

    public void setGeneratedby(Operator generatedby) {
        this.generatedby = generatedby;
    }


}
