package CaseStudies.ParkingLot.Models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime;
    private Gate exitedAt;
    private Operator generatedBy;
    private Ticket ticket;
    private int amount;
    private BillStatus billStatus;
    private List<Payment> payments;
    private List<FeeCalculateStrategyType> feeCalculateStrategyTypes;

}
