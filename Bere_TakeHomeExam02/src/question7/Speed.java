/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author keerthi prayojitha bere
 */
public enum Speed {
    LOW(50),
    MEDIUM(100),
    HIGH(150);
    public final int value;

    /**
     * this is a parameterized constructor with value parameter
     *
     * @param value
     */
    private Speed(int value) {
        this.value = value;
    }

}
