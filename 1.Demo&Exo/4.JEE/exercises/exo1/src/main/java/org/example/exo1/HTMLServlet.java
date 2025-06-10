package org.example.exo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HTMLServlet", value = "/html-servlet")
public class HTMLServlet extends HttpServlet {

    private String text;

    @Override
    public void init() throws ServletException {
        System.out.println("test servlet html");
        text = "htmlezaoiheaiheza";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>" + text + "</h1>");
        writer.println("<h2> bbbbb</h2>");
        writer.println("</body></html>"); // mais pas tres pratique  ecrire en writer. blabla


    }

}

