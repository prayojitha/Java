/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.time.LocalDate;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Staff extends Employee {

    String title;

    /**
     * this is a parameterized constructor with super class attributes
     *
     * @param title
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     * @param office
     * @param salary
     * @param dateHired
     */
    public Staff(String title, String name, String address, String phoneNumber, String emailAddress, int office, double salary, LocalDate dateHired) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    /**
     * this is a getter method to get title
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * this is a setter method to set title
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * this is a toString()
     *
     * @return
     */
    @Override
    public String toString() {
        return getClass() + "= " + super.name;
    }

}
