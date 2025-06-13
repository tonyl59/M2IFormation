package org.example.exo6.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.exo6.model.Car;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped // va faire un singleton du voiture service
public class CarService {
    private List<Car> cars = new ArrayList<>();
    private int currentId = 1;

    //Enregistrement d'une voiture dans la liste des voitures
    public void create(Car car){
        car.setId(currentId++);
        cars.add(car);
    }

    // Renvoi de touta la liste des voitures
    public List<Car> get_all(){
        return cars;
    }

    // Renvoi d'une voiture trouvée par rapport à son id
    public Car findById(int id){
        // à la place on peut faire : return cars.stream().filter(c->c.getId().equals(id)).findFirst().orElse(null);
        for (Car car: cars){
            if(car.getId() == id){
                return car;
            }
        }
        return null;
    }
    // Modifie une voiture et la renvoie pour confirmer
    public Car update(Car carUpdate){
        Car car = findById(carUpdate.getId());
        car.setModel(carUpdate.getModel());
        car.setYear(carUpdate.getYear());
        car.setColor(carUpdate.getColor());
        return car;
    }


    public void delete(int id){
        //cars.remove(findById(id));
        cars.removeIf(car -> car.getId() == id);
    }
}
