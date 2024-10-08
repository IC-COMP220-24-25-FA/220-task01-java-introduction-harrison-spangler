package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;
    
    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       double area = length * width;
       return area;
    }

    public void doubleSize(){
        this.length = length * 2;
        this.width = width * 2;
    }

    public double longestLineWithin(){
        if (length < width) {
            return width;
        }
        else {
            return length;
        }
    }
    
}
