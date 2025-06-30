package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SearchCityTest {
    private SearchCity searchCity;
    private List<String> testCities = Arrays.asList("Paris","Budapest","Skopje","Rotterdam",
            "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong",
            "Dubaï", "Istanbul");


    @BeforeEach
    public void setup(){
        searchCity = new SearchCity(testCities);
    }

    @Test
    public void when_wordV_findValenceVancouverVienne(){
        List<String> result = searchCity.search("v");
        List<String> expected = Arrays.asList("Valence", "Vancouver", "Vienne");
        Assertions.assertEquals(expected, result);
        // will not work because NotFoundException when word length <2

    }

    @Test
    public void when_wordVa_findValenceVancouver(){
        List<String> result = searchCity.search("vA"); // VA, Va, vA & va both work since we made research function case insensible (.lowercase when bool checking)
        List<String> expected = Arrays.asList("Valence", "Vancouver");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void when_wordape_findBudapest(){
        List<String> result = searchCity.search("ape");
        List<String> expected = Arrays.asList("Budapest");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void when_asterisk_findAll(){
        List<String> result = searchCity.search("*");
        Assertions.assertEquals(testCities, result);
    }

    @Test
    public void when_worddAm_find_Amsterdam(){
        List<String> result = searchCity.search("dAm");
        List<String> expected = Arrays.asList("Amsterdam");
        Assertions.assertEquals(expected, result); // Doesnt work because search results also has Rotterdam in addition to Amsterdam
    }





}
