package lk.ijse.car_rent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {
    private String orderId;
    private String dateTime;
    private String returnDate;
    private boolean bankSlip;
    private double lossDamage;
    private double status;

}
