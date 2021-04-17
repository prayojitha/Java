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
public class Bmw implements Brake, Accelerate {

    /**
     * this method overrides applyBrake method of Brake interface
     *
     * @return
     */
    @Override
    public String applyBrake() {
        return "Bmw's break feature is very smooth";
    }

    /**
     * this is a toString() method
     *
     * @return
     */
    @Override
    public String toString() {
        return "Bmw: " + this.applyBrake() + " " + this.accelerate();
    }

    /**
     * this method overrides applyBrake method of accelerate interface
     *
     * @return
     */
    @Override
    public String accelerate() {
        return "Bmw's accelerate from 0 to 60mi/h in 5 seconds";
    }
}
