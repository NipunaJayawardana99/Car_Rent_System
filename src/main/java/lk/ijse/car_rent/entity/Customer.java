package lk.ijse.car_rent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    private String nicno;
    private String name;
    private String address;
    private double contact;
    private String email;
    private String password;

}

//    @OneToMany(mappedBy = "customer")
//    private List<Orders> orders = new ArrayList<>();

