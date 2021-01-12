package lk.ijse.car_rent.advisor;

import lk.ijse.car_rent.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {

    public ResponseEntity handleException(RuntimeException e) {
        StandardResponse response = new StandardResponse(500, "Error", e.getMessage());
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
