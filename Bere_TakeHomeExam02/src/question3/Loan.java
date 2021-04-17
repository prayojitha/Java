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
public class Loan {

    double amount;

    /**
     * This is a parameterized constructor with amount as parameter
     *
     * @param amount
     */
    public Loan(double amount) {
        this.amount = amount;
    }

    /**
     * This is a toString() method which returns loan amount
     *
     * @return
     */
    @Override
    public String toString() {
        return "Loan amount = " + amount;
    }

}
