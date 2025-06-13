package org.example.exo6;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;
import java.util.List;

import static java.time.LocalDate.now;

@Path("/car")
public class CarResource {
    private CarService carService;

   /* @Inject
    public CarResource(CarService carService) {CarService carService){this.carService = carService;}
}*/

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCar() {return carService.get_all();}
    @POST


    @Path("/withservice")
    @Produces(MediaType.APPLICATION_JSON)
    public Car postCar(@QueryParam("model") String model, @QueryParam("bdate") LocalDate localdate, @QueryParam("color") String color){
        return carService.save(model,LocalDate.now(),color);
    }

    @DELETE
    @Path("/delete/{id}")
    public int delete(@PathParam("id") int id){return id;}

}
