package lk.ijse.car_rent.repo;

import lk.ijse.car_rent.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders, String> {
    public boolean deleteByOrderId(String id);
}
