package lk.ijse.car_rent.controller;

import lk.ijse.car_rent.dto.CarDTO;
import lk.ijse.car_rent.service.CarService;
import lk.ijse.car_rent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/car")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity saveCar(@RequestBody CarDTO dto) {
        carService.saveCar(dto);
        System.out.println(dto.toString());
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateCar(@RequestBody CarDTO dto) {
        carService.updateCar(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteCar(String id) {
        carService.deleteCar(id);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchCar(@PathVariable String id) {
        carService.searchCar(id);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllCars() {
        List<CarDTO> allCar = carService.getAllCars();
        StandardResponse response = new StandardResponse(200, "Success", allCar);
        return new ResponseEntity(response, HttpStatus.CREATED);

    }
}
