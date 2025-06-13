package org.example.exo6.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.exo6.model.Car;
import org.example.exo6.service.CarService;

import java.time.LocalDate;
import java.util.List;

import static java.time.LocalDate.now;

@Path("/car")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarResource {
    private CarService carService;

   @Inject
   public CarResource(CarService carService){this.carService = carService;}

    // R de CRUD : Une route pour avoir toutes les voitures
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCars() {return carService.get_all();}
    // R de CRUD : Une route pour avoir une voiture par rapport à son id
    @GET
    @Path("/{id}")
    public Car findById(@PathParam("id") int id){
       return carService.findById(id);
    }

    //Cde CRUD : une route pour ajouter une voiture à ma liste de voiture
    @POST
    public Car create(Car car) {
       carService.create(car);
       return car;
    }

    // U de CRUD
    // Une route pour modifier une voiture
    @PUT
    @Path("/{id}")
    public Car update (@PathParam("id") int id,Car car){
        car.setId(id);
        return carService.update(car);
    }

    // D de CRUD
    // Une route pour supprimer une voiture
    @DELETE
    @Path("/{id}")
    public List<Car> delete(@PathParam("id") int id){
        carService.delete(id);
        return carService.get_all();
    }



}
