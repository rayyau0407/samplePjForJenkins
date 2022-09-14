package controller;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class CarRepository {

  public Car findCar(){
    Car car = new Car();

    car.setCarColor("red");
    car.setCarModel("tesla");
    car.setCarLiscenseNumber("ABC123");
    return car;
  }
}
