package org.example.exo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "JSPServlet", value = "/jsp-servlet")
public class JSPServlet extends HttpServlet {

    private String text;

    @Override
    public void init() throws ServletException {
        System.out.println("test servlet jsp");
        text = "JSPezaoiheaiheza";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/newPage.jsp").forward(req, resp);
    }
}