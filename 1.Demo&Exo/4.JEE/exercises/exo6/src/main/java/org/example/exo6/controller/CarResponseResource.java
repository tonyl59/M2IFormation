package org.example.exo6.controller;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.exo6.model.Car;
import org.example.exo6.service.CarService;

import java.util.List;

@Path("/carresp")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarResponseResource {

    private CarService carService;

    @Inject
    public CarResponseResource(CarService carService) {
        this.carService = carService;
    }

    // CREATE
    @POST
    public Response create(Car car){
        carService.create(car);
        return Response.status(Response.Status.CREATED).entity(car).build();
    }

    // READ
    @GET
    public List<Car> findAll(){
        return carService.get_all();
    }

    @GET
    @Path("{id}")
    public Response findById(@PathParam("id") int id){
        Car car = carService.findById(id);
        if(car == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(car).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") int id, Car car){
        car.setId(id);
        Car car1 = carService.update(car);
        if(car1 != null){
            return Response.ok(car1).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
    //DELETE
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id){
        carService.delete(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

}
