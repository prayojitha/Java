/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Car {

    String carCategory;

    /**
     * this is a getter method for cat category
     *
     * @return car category
     */
    public String getCarCategory() {
        return carCategory;
    }

    /**
     * this is a setter method for setting car category
     *
     * @param carCategory
     */
    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory;
    }

    /**
     * this is a parameterized constructor with parameter carCategory
     *
     * @param carCategory
     */
    public Car(String carCategory) {
        this.carCategory = carCategory;
    }

    /**
     * this is a toString() method which returns carCategory
     *
     * @return
     */
    @Override
    public String toString() {
        return "carCategory is = " + carCategory;
    }

}
