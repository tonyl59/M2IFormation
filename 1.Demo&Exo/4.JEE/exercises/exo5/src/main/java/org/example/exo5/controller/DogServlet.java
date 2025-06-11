package org.example.exo5.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exo5.model.Dog;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DogServlet", value = "/dog-servlet")
public class DogServlet extends HttpServlet {
    private List<Dog> dogs;
    private int count = 1;


    @Override
    public void init() throws ServletException {
        dogs = new ArrayList<>();
        /*Dog dog1 = new Dog("Robert", "race1", "bone","17/03/2020");
        Dog dog2 = new Dog("Poochy", "race2", "dogpaste010","20/07/2018");
        Dog dog3 = new Dog("Caninos", "race1", "steak","25/10/2022");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3); */

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        LocalDate bdate = LocalDate.parse(req.getParameter("bdate"));

        Dog dog = new Dog(name,breed,bdate);
        dogs.add(dog);
        doGet(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("dogs", dogs);
        req.getRequestDispatcher("/dogtablePage.jsp").forward(req, resp);
    }
}
