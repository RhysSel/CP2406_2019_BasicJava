package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SandwichTest {
    @Test
    void makeSandwich() {
        Sandwich sandwich = new Sandwich();

        sandwich.setMainIngredient("Turkey");
        assertEquals("Turkey", sandwich.getMainIngredient());

        sandwich.setBreadType("White");
        assertEquals("White", sandwich.getBreadType());

        sandwich.setPrice(25.00);
        assertEquals(25.00, sandwich.getPrice());
    }
}