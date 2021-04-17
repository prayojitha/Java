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
public class Sedan extends Car {

    /**
     * this method overrides the abstract method of Car class
     */
    @Override
    public void brake() {
        System.out.println("The sedan is slowing down!");
    }

}
