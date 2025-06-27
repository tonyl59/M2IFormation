package org.example;

import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {
    private GradingCalculator grading;

    @Test
    public void whenScore95_presence90_then_noteA(){
        grading = new GradingCalculator(95,90);
        char result = grading.getGrade();
        Assert.assertEquals('B',result); // Error when B, works with A
    }

    @Test
    public void whenScore85_presence90_then_noteB(){
        grading = new GradingCalculator(85,90);
        char result = grading.getGrade();
        Assert.assertEquals('B',result); // error when expected = A, C, F
    }

    @Test
    public void whenScore65_presence90_then_noteC(){
        grading = new GradingCalculator(65,90);
        char result = grading.getGrade();
        Assert.assertEquals('C',result);
    }

    @Test
    public void whenScore95_presence65_then_noteB(){
        grading = new GradingCalculator(95,65);
        char result = grading.getGrade();
        Assert.assertEquals('B',result);
    }

    @Test
    public void whenScore95_presence55_then_noteF(){
        grading = new GradingCalculator(95,55);
        char result = grading.getGrade();
        Assert.assertEquals('F',result);
    }

    @Test
    public void whenScore65_presence55_then_noteF(){
        grading = new GradingCalculator(65,55);
        char result = grading.getGrade();
        Assert.assertEquals('F',result);
    }

    @Test
    public void whenScore50_presence90_then_noteF(){
        grading = new GradingCalculator(50,90);
        char result = grading.getGrade();
        Assert.assertEquals('F',result);
    }


/*
- Score : 50%, Présence : 90 => Note: F
    }
        /   public char getGrade() {
        if (Score > 90 && AttendancePercentage > 70) return 'A';
        else if (Score > 80 && AttendancePercentage > 60) return 'B';
        else if (Score > 60 && AttendancePercentage > 60) return 'C';
        else return 'F'; */

}
