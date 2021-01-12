package lk.ijse.car_rent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class OrderReturn {
    @Id
    private String oReturnId;
    private String date;
    private double usedKm;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "orderId", referencedColumnName = "orderId", nullable = false)
//    private Orders orders;
}
