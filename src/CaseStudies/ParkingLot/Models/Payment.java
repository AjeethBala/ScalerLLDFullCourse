package CaseStudies.ParkingLot.Models;

import java.sql.Struct;
import java.util.Date;
import java.util.List;

public class Payment extends BaseModel {
    private  int amount;
    private Date paidTime;

    private List<PaymentMode> paymentModes;
    private String referenceNumber;
    private PaymentStatus paymentStatus;


}
