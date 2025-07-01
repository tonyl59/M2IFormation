package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ShopTest {
    private Shop shop = new Shop();
    private Product product;



    @ParameterizedTest
    @CsvSource({
            "2,10, Salad, Vegetable, 1, 9", // if sellin 2 qual 10 then 1 9
            "1,10, Salad, Vegetable, 0, 8", // if sellin 1 qual 10 then 0 8
            "0,10, Salad, Vegetable, 0, 8", // if sellin 0 qual 10 then 0 8
            "5,52, Salad, Vegetable, 4, 51", // if sellin 5 qual 52 then 4 51 => Error because quality cannot be >50
            "5,51, Salad, Vegetable, 4, 50", // if sellin 5 qual 50 then 4 49 => became 50 so fine
            "5,0, Salad, Vegetable, 4, 0", // if sellin 5 qual 0 then 4 0 => error because quality cannot be <0

            "2, 10, Camembert, Dairy, 1, 8", // if sellin2 qual 10 DAIRY then 1 8
            "1, 10, Camembert, Dairy, 0, 6", // if sellin1 qual 10 DAIRY then 0 6
            "0,10, Camembert, Dairy, 0, 6", // if sellin 0 qual 10 then 0 8
            "1, 10, Aged Brie, Dairy, 0, 11", // if sellin1 qual 10 DAIRY then 0 6
            "5,50, Aged Brie, Dairy, 4, 51", // if sellin5 qual50 dairy then 4 51 => error because quality cannot be >50




    })

    public void when_SellinQualityNameType_then_result(int sellin, int quality, String name, String type, int sellin_final, int quality_final){
        Product result = shop.update(new Product(sellin, quality, name, type));
        Assert.assertEquals(quality_final, result.getQuality());
        Assert.assertEquals(sellin_final, result.getSellin());



    }
}
