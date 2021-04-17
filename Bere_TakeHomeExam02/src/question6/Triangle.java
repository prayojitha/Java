/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    /**
     * This is a parameterized constructor with super class attributes
     *
     * @param color
     * @param filled
     * @param side1
     * @param side2
     * @param side3
     */
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * This is a getter method to get one side
     *
     * @return side1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * This is a getter method to get second side
     *
     * @return side2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * This is a getter method to get third side
     *
     * @return side3
     */
    public double getSide3() {
        return side3;
    }

    /**
     * this is a method to get Area of triangle
     *
     * @return area
     */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * this is a method to get perimeter of triangle
     *
     * @return perimeter
     */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * This is a toString() returns triangle sides
     *
     * @return
     */
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2
                + " side3 = " + side3;
    }

}
