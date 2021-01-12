package lk.ijse.car_rent.controller;

import lk.ijse.car_rent.dto.CustomerDTO;
import lk.ijse.car_rent.service.CustomerService;
import lk.ijse.car_rent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity saveCustomer(@RequestBody CustomerDTO dto) {

        customerService.saveCustomer(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody CustomerDTO dto) {
        customerService.updateCustomer(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteCustomer(String id) {
        customerService.deleteCustomer(id);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchCustomer(@PathVariable String id) {
        customerService.searchCustomer(id);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllCustomers() {
        List<CustomerDTO> allCustomer = customerService.getAllCustomer();
        StandardResponse response = new StandardResponse(200, "Success", allCustomer);
        return new ResponseEntity(response, HttpStatus.CREATED);

    }
}
