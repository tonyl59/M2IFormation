package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class DiceScoreTest {
    private DiceScore diceScore;
    private Ide de = Mockito.mock(Ide.class);

    @Test
    public void when2same_thenValueDx2plus10(){
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(4);
        int result = diceScore.getScore();

        Assert.assertEquals(18,result); // here 4*2 +10 = 18, so anything but 18 doesnt work if both dice roll 4.
    }

    @Test
    public void whenboth6_thenValue30(){
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(6);
        int result = diceScore.getScore();

        Assert.assertEquals(30,result); // Two 6 is always 30, so we get error with a value other than 30 here
    }

    @Test
    public void whenbothnotequal_then_highestdicevalue(){
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(3, 5);
        int result = diceScore.getScore();


        Assert.assertEquals(5,result); // ^ if result is anything but the highest value out of the two rolls => Error
        //Assert.assertTrue(result<6);
    }






}
