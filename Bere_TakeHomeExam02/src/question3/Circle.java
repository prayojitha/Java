/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Circle {

    int radius;

    /**
     * This is a parameterized constructor with radius as parameter
     *
     * @param radius
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * This is a toString() method and it returns circle radius
     *
     * @return
     */
    @Override
    public String toString() {
        return "Circle radius = " + radius;
    }

}
