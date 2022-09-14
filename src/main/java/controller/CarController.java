package controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequestMapping(path = "/car")
public class CarController {
  @Autowired
  CarService carService;

  @GetMapping(path = "/findByLiscenseNum")
  public Car getCar(@RequestParam String carLicenseNum) {
    return carService.getCar();
  }

  @GetMapping
  public String ping() {
    return "pinged car controller";
  }

  @GetMapping(path = "/tesla")
  public String tesla() {
    return "pinged tesla";
  }

  @GetMapping(path = "/tesla2")
  public String tesla2() {
    return "pinged tesla2";
  }
}
