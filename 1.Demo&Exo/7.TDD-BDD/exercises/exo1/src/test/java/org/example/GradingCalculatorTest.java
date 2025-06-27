package org.example;

import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {
    private GradingCalculator grading;

    @Test
    public void whenScore95_presence90_then_note1(){
        grading = new GradingCalculator(95,90);
        char result = grading.getGrade();
        Assert.assertEquals('A',result);
    }

    /*    public char getGrade() {
        if (Score > 90 && AttendancePercentage > 70) return 'A';
        else if (Score > 80 && AttendancePercentage > 60) return 'B';
        else if (Score > 60 && AttendancePercentage > 60) return 'C';
        else return 'F';

        - Score : 95%, Présence : 90 => Note: A
- Score : 85%, Présence : 90 => Note: B
- Score : 65%, Présence : 90 => Note: C
- Score : 95%, Présence : 65 => Note: B
- Score : 95%, Présence : 55 => Note: F
- Score : 65%, Présence : 55 => Note: F
- Score : 50%, Présence : 90 => Note: F
    }*/
}
