package org.example;

import org.example.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class SearchCity {
    private List<String> cities;

    public SearchCity(List<String> cities){
        this.cities = cities;

    }

    public List<String> search(String word){

        if (word.length() < 2) {
            if (word.equals("*")) {
                return cities;
            }
            throw new NotFoundException("Word length should at least have 2 characters !");
        }
        List<String> citiesfound = new ArrayList<>();
        for (String c : cities){
            if (c.toLowerCase().contains(word.toLowerCase())){
                citiesfound.add(c);
            }
        }
        return citiesfound;
    }
}




