package org.example.exo6;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarService {
    private List<Car> cars = new ArrayList<>();

    public Car save(String model, LocalDate bdate, String color){
        Car car = new Car(model, bdate, color);
        cars.add(car);
        return car;
    }

    public List<Car> get_all(){
        return cars;
    }

    public void delete(int id){
        cars.remove(id-1);
    }
}
