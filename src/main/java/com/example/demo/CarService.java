package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class CarService {
  @Autowired
  CarRepository carRepository;

  public Car getCar() {
    return carRepository.findCar();
  }
}
