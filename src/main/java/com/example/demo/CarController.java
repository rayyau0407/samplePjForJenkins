package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequestMapping(path = "/car")
public class CarController {
  @Autowired
  CarService carService;

  @GetMapping
  public Car getCar(@RequestParam String carLicenseNum) {
    return carService.getCar();
  }
}
