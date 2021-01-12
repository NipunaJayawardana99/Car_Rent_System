package lk.ijse.car_rent.controller;

import lk.ijse.car_rent.dto.CarDTO;
import lk.ijse.car_rent.dto.CustomerDTO;
import lk.ijse.car_rent.dto.DriverDTO;
import lk.ijse.car_rent.dto.OrderDTO;
import lk.ijse.car_rent.service.CarService;
import lk.ijse.car_rent.service.CustomerService;
import lk.ijse.car_rent.service.DriverService;
import lk.ijse.car_rent.service.OrderService;
import lk.ijse.car_rent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    CustomerService customerService;

    @Autowired
    CarService carService;

    @Autowired
    DriverService driverService;

//    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity addOrder(@RequestBody OrderDTO dto) {
//        CustomerDTO cus = customerService.searchCustomer(dto.getOrderId());
////        CarDTO car = carService.searchCar(dto.getCar().getRegNo());
////        DriverDTO driver = driverService.searchDriver(dto.getDriver()getDriverId());
//
//        OrderDTO order = new OrderDTO(
//                dto.getOrderId(),
//                dto.getDateTime(),
//                dto.getReturnDate(),
//                dto.isBankSlip(),
//                dto.getLossDamage(),
//                dto.getStatus(),
//                cus,
//                car,
//                driver);
//
//        orderService.saveOrder(order);
//
//        StandardResponse response = new StandardResponse(200, "Success", null);
//        return new ResponseEntity(response, HttpStatus.CREATED);
//    }
//
//    @PutMapping
//    public ResponseEntity updateOrder(@RequestBody OrderDTO dto) {
//        CustomerDTO cus = customerService.searchCustomer(dto.getCustomer().getNic());
//        CarDTO car = carService.searchCar(dto.getCar().getRegNo());
//        DriverDTO driver = driverService.searchDriver(dto.getDriver().getDriverId());
//
//        OrderDTO order = new OrderDTO(
//                dto.getOrderId(),
//                dto.getDateTime(),
//                dto.getReturnDate(),
//                dto.isBankSlip(),
//                dto.getLossDamage(),
//                dto.getStatus(),
//                cus,
//                car,
//                driver);
//
//        orderService.saveOrder(order);
//
//        StandardResponse response = new StandardResponse(200, "Success", null);
//        return new ResponseEntity(response, HttpStatus.CREATED);
//    }
//
//    @DeleteMapping(params = {"id"})
//    public ResponseEntity deleteOrder(String id) {
//        orderService.deleteOrder(id);
//        StandardResponse response = new StandardResponse(200, "Success", null);
//        return new ResponseEntity(response, HttpStatus.CREATED);
//    }
//
//    @GetMapping(path = "/{id}")
//    public ResponseEntity searchOrder(@PathVariable String id) {
//        orderService.searchOrder(id);
//        StandardResponse response = new StandardResponse(200, "Success", null);
//        return new ResponseEntity(response, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<StandardResponse> getAllOrders() {
//        List<OrderDTO> allOrders = orderService.getAllOrders();
//        StandardResponse response = new StandardResponse(200, "Success", allOrders);
//        return new ResponseEntity(response, HttpStatus.CREATED);
//
//    }
}
