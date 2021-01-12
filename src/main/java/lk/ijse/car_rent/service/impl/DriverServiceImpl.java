package lk.ijse.car_rent.service.impl;

import lk.ijse.car_rent.service.DriverService;
import lk.ijse.car_rent.dto.DriverDTO;
import lk.ijse.car_rent.entity.Driver;
import lk.ijse.car_rent.repo.DriverRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    DriverRepo driverRepo;

    @Override
    public void saveDriver(DriverDTO dto) {
        if (!driverRepo.existsById(dto.getDriverId())) {
            driverRepo.save(modelMapper.map(dto, Driver.class));
        } else {
            throw new RuntimeException("Driver Already Exist!");
        }
    }

    @Override
    public void updateDriver(DriverDTO dto) {
        if (driverRepo.existsById(dto.getDriverId())) {
            driverRepo.save(modelMapper.map(dto, Driver.class));
        } else {
            throw new RuntimeException("Driver Not Found!");
        }
    }

    @Override
    public DriverDTO searchDriver(String id) {
        Optional<Driver> driver = driverRepo.findById(id);
        if (driver.isPresent()) {
            return modelMapper.map(driver.get(), DriverDTO.class);
        } else {
            throw new RuntimeException("Driver does not exist!");
        }
    }

    @Override
    public void deleteDriver(String id) {
        if (driverRepo.existsById(id)) {
            driverRepo.deleteById(id);
        } else {
            throw new RuntimeException("Couldn't to delete Driver!");
        }
    }

    @Override
    public List<DriverDTO> getAllDrivers() {
        return modelMapper.map(driverRepo.findAll(), new TypeToken<List<DriverDTO>>() {
        }.getType());
    }
}
