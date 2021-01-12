package lk.ijse.car_rent.service;

import lk.ijse.car_rent.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    void saveOrder(OrderDTO dto);

    void updateOrder(OrderDTO dto);

    OrderDTO searchOrder(String id);

    void deleteOrder(String id);

    List<OrderDTO> getAllOrders();
}
