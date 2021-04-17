/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Employee extends Person {

    int office;
    double salary;
    LocalDate dateHired;

    /**
     * this is a parameterized constructor with super class arguments
     *
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     * @param office
     * @param salary
     * @param dateHired
     */
    public Employee(String name, String address, String phoneNumber, String emailAddress, int office, double salary, LocalDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    /**
     * this is a getter method to get office number
     *
     * @return office
     */
    public int getOffice() {
        return office;
    }

    /**
     * this is a getter method to set office number
     *
     * @param office
     */
    public void setOffice(int office) {
        this.office = office;
    }

    /**
     * this is a getter method to get salary
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * this is a setter method to set salary
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * this a getter method to get hired date
     *
     * @return
     */
    public LocalDate getDatehired() {
        return dateHired;
    }

    /**
     * this is a setter method to set hired date
     *
     * @param dateHired
     */
    public void setDatehired(LocalDate dateHired) {
        this.dateHired = dateHired;
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
