package org.example.exo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RoughServlet", value = "/rough-servlet")
public class RoughServlet extends HttpServlet {

    private String text;

    @Override
    public void init() throws ServletException {
        System.out.println("test servlet html");
        text = "ROUGHezaoiheaiheza";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Une requête GET a été envoyé à /Roughservlet !!!!");

        resp.setContentType("text/plain");

        PrintWriter writer = resp.getWriter();
        writer.println("rough servlet text test!!!");

    }
}