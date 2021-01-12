package lk.ijse.car_rent.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class CustomerDTO {
    private String nicno;
    private String name;
    private String address;
    private double contact;
    private String email;
    private String password;
}
