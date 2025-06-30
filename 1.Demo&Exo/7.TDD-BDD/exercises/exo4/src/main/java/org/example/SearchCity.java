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
        if (word.equals("*")){
            return cities;
        }else{
            if (word.length() < 2){
                throw new NotFoundException("Word length should at least 2 characters !");
            } else{
                List<String> citiesfound = new ArrayList<>();
                for (String c : cities){
                    if (c.toLowerCase().contains(word.toLowerCase())){
                        citiesfound.add(c);
                    }
                }
                return citiesfound;
            }
        }
    }


}
