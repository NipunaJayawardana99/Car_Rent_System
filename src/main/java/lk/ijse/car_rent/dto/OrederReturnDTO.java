package lk.ijse.car_rent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrederReturnDTO {
    private String oReturnId;
    private String date;
    private double usedKm;
}
