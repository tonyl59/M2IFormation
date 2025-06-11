package org.example.exo4.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exo4.Model.Cat;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CatServlet", value = "/cat-servlet")
public class CatServlet extends HttpServlet {
    private List<Cat> cats;


    @Override
    public void init() throws ServletException {
        cats = new ArrayList<>();
        /*Cat cat1 = new Cat("Pepito", "race1", "mice","17/03/2020");
        Cat cat2 = new Cat("Wiskas", "race2", "rat","20/07/2018");
        Cat cat3 = new Cat("Meowth", "race1", "catpaste085","25/10/2022");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3); */

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        String fav_meal = req.getParameter("fav_meal");
        LocalDate bdate = LocalDate.parse(req.getParameter("bdate"));

        Cat cat = new Cat(name,breed, fav_meal, bdate);
        cats.add(cat);
        doGet(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cats", cats);
        req.getRequestDispatcher("/catPage.jsp").forward(req, resp);
    }
}
