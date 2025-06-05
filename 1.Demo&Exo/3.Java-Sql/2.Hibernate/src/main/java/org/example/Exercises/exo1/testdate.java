package org.example.Exercises.exo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testdate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Date date = formatter.parse("20-10-2015");
        System.out.println(date);
    }
}
