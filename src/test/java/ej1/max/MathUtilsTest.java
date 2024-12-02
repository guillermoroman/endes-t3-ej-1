package ej1.max;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MathUtilsTest {

    @Test
    public void testMaxWithPositiveNumbers(){
        int x = 3;
        int y = 5;

        int result = MathUtils.max(x,y);

        assertEquals(5, result);
    }

    @Test
    public void testMaxWithNegativeNumbers(){
        assertEquals(-3, MathUtils.max(-5, -3));
    }

    @Test
    public void testMaxWithMixedNumbers(){
        assertEquals(3, MathUtils.max(-5, 3));
    }

    @Test
    public void testMaxWithEqualNumbers(){
        assertEquals(6, MathUtils.max(6,6));
    }
}
