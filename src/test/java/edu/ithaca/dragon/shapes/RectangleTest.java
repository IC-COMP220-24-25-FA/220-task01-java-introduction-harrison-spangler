package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(3, 2);
        assertEquals(6, myRectangle.calcArea());
        
        Rectangle myRectangle1 = new Rectangle(4, 2);
        assertEquals(8, myRectangle1.calcArea());

        Rectangle myRectangle2 = new Rectangle(10, 4);
        assertEquals(40, myRectangle2.calcArea());
    }
    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(3, 2);
        assertEquals(12, myRectangle.calcArea());
        
        Rectangle myRectangle1 = new Rectangle(4, 2);
        assertEquals(16, myRectangle1.calcArea());

        Rectangle myRectangle2 = new Rectangle(10, 4);
        assertEquals(80, myRectangle2.calcArea());
    }
    @Test
    public void longestLineWithinTest(){
        Rectangle myRectangle = new Rectangle(3, 2);
        assertEquals(3, myRectangle.longestLineWithin());
        
        Rectangle myRectangle1 = new Rectangle(4, 2);
        assertEquals(4, myRectangle1.longestLineWithin());

        Rectangle myRectangle2 = new Rectangle(10, 4);
        assertEquals(10, myRectangle2.longestLineWithin());
    }
}