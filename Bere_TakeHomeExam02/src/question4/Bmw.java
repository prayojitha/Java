/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 * Bmw class extends Car class which means it inherits all its super class
 * properties
 *
 * @author keerthi prayojitha bere
 */
public class Bmw extends Car {

    String colour;
    String model;

    /**
     * This is a parameterized constructor with 3 arguments and super class
     * attribute
     *
     * @param colour
     * @param model
     * @param carCategory
     */
    public Bmw(String colour, String model, String carCategory) {
        super(carCategory);
        this.colour = colour;
        this.model = model;
    }

    /**
     * this is a getter method to get car colour
     *
     * @return colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * this is a setter method to set car colour
     *
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

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
     * this is a method to get car category and it overrides super class method
     *
     * @return
     */
    @Override
    public String getCarCategory() {
        return carCategory;
    }

    /**
     * this is a method to set car category and it overrides super class method
     *
     * @param carCategory
     */
    @Override
    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory;
    }

    /**
     * this is a toString() method which returns String and toString() of super
     * class
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() +"\n"+ "Bmw colour = " + colour + ", Bmw model=" + model;
    }

}
