package org.example.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.model.Person;

@WebServlet(name = "PersonServlet", value = "/person-servlet")
public class PersonServlet extends HttpServlet {
    private List<Person> persons;

    @Override
    public void init() throws ServletException {

        List<Person> persons = new ArrayList<>();
        Person person1 = new Person("LUONG","Tony",29);
        Person person2 = new Person("LUANG","Toto",20);
        Person person3 = new Person("LUING","Tata",23);
        Person person4 = new Person("LUENG","Titi",26);
        Person person5 = new Person("LUUNG","Tutu",32);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("persons", persons);
        getServletContext().getRequestDispatcher("/personPage.jsp").forward(request,response);
    }
}