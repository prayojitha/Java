/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Car implements Brake {

    /**
     * this method overrides Brake interface applyBrake abstract method
     *
     * @return
     */
    @Override
    public String applyBrake() {
        return "Break is an important feature for every car";
    }

    /**
     * this is a toString()
     *
     * @return
     */
    @Override
    public String toString() {
        return "Car: " + this.applyBrake();
    }

}
