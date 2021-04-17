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
public abstract class GeometricObject {

    private String color;
    private boolean filled;

    /**
     * This is a parameterized constructor
     *
     * @param color
     * @param filled
     */
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * This is a getter method to get color
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * This is a method to set color
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This is method to check if color is filled or not
     *
     * @return
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * This is a method to color
     *
     * @param filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * This is a toString() which return color and filled or not
     *
     * @return
     */
    @Override
    public String toString() {
        return "color: " + color
                + " and filled: " + filled;
    }

}
