package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Circle myCircle = new Circle(1);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(3.1415, myCircle.calcArea(), 0.0001);
        
        myCircle = new Circle(5.5);
        assertEquals(95.0331, myCircle.calcArea(), 0.0001);

        myCircle = new Circle(0.001);
        assertEquals(0.00000314159, myCircle.calcArea(), 0.0000000001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }

    @Test
    public void TestlongestLineWithin(){
        Circle myCircle1 = new Circle(1);
        assertEquals(2, myCircle1.longestLineWithin());

        Circle myCircle2 = new Circle(4.15);
        assertEquals(8.3, myCircle2.longestLineWithin());
    }

    @Test
    public void TestdoubleSize(){
        Circle myCircle3 = new Circle(1);
        assertEquals(6.283, myCircle3.longestLineWithin());
        Circle myCircle4 = new Circle(2);
        assertEquals(25.132, myCircle4.longestLineWithin());
    }


    
}
