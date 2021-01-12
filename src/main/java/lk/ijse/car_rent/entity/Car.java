package lk.ijse.car_rent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Car {
    @Id
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

//    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
//    private List<CarImage> carImages;
//
//    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
//    private List<Orders> orders = new ArrayList<>();
}
