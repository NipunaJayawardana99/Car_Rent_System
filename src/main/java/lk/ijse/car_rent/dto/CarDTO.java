package lk.ijse.car_rent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarDTO {
    private String regNo;
    private String brand;
    private String type;
    private String color;
    private String fuelType;
    private String transmissionType;
    private int noOfPassengers;
    private double DailyRate;
    private double FreeKmForDay;
    private double MonthlyRate;
    private double FreeKmForMonth;
    private double priceForExtraKm;
//    private CarImage carImage;
}
