/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author keerthi prayojitha bere
 */
public abstract class Car {

    private String model;
    private String color;
    private int maxSpeed;

    /**
     * this is an abstract method
     */
    public abstract void brake();

    /**
     * this is a getter method to get model
     *
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * this is a setter method to set model
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * this is a getter method to get color
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * this is a setter method to set color
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * this is a method to get maximum speed
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * this is a method to set max speed
     *
     * @param maxSpeed
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * this is a method print gas availability
     */
    public void gas() {
        System.out.println("Gas Available!");
    }

}
