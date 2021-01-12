package lk.ijse.car_rent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DriverDTO {
    private String driverId;
    private String contact;
    private String name;
}
