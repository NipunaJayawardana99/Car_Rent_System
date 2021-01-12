package lk.ijse.car_rent.service;

import lk.ijse.car_rent.dto.DriverDTO;

import java.util.List;


public interface DriverService {
    void saveDriver(DriverDTO dto);

    void updateDriver(DriverDTO dto);

    DriverDTO searchDriver(String id);

    void deleteDriver(String id);

    List<DriverDTO> getAllDrivers();
}
