package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibTest {
    private Fib fib;


    @Test
    public void when_Range1_then_resultNotEmpty() {
        fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();
        Assert.assertFalse(result.isEmpty()); // replacing with !result.isEmpty() = not passed
    }

    @Test
    public void when_Range1_then_result000() {
        fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();
        List<Integer> all0 = Arrays.asList(0); // making the array longer than 1 value or display anything but 0 = not passed
        Assert.assertEquals(all0, result);
    }

    @Test
    public void when_Range6_then_resultcontainsVal3() {
        fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        Assert.assertTrue(result.contains(3)); // put a value that isnt 0, 1, 2,3 or 5 = not passed
    }

    @Test
    public void when_Range6_then_resultcontains6elem() {
        fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        Assert.assertTrue(result.size() == 6); // put a value that isnt 6 = not passed... or reverse with != = not passed
    }

    @Test
    public void when_Range6_then_resultcontainsnotVal4() {
        fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        Assert.assertFalse(result.contains(4)); // replace assertFalse by assertTrue, or result.contains(4) by ! result.contains(4) or replacing 4 by any value = not passed
    }

    @Test
    public void when_Range6_then_result011235() {
        fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        List<Integer> valuescheck = Arrays.asList(0, 1, 1, 2, 3, 5); // replacing any of the value by something else(or remove/add another value) = not passed
        Assert.assertEquals(valuescheck, result);
    }

    @Test
    public void when_Range6_then_asc() {
        fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        Assert.assertEquals(result.stream().sorted().toList(), result); //
    }
}





