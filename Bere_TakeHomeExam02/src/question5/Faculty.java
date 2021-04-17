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
public class Faculty extends Employee {

    int officeHours;
    int numberOfTeachingSubjects;

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
     * @param officeHours
     * @param numberOfTeachingSubjects
     */
    public Faculty(String name, String address, String phoneNumber, String emailAddress, int office, double salary, LocalDate dateHired, int officeHours, int numberOfTeachingSubjects) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    /**
     * this is a getter method to get office hours
     *
     * @return office hours
     */
    public int getOfficeHours() {
        return officeHours;
    }

    /**
     * this is a setter method to set officeHours
     *
     * @param officeHours
     */
    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    /**
     * this is a getter method to get number of teaching subjects
     *
     * @return number of teaching subjects
     */
    public int getNumberOfTeachingSubjects() {
        return numberOfTeachingSubjects;
    }

    /**
     * this is a setter method to get number of teaching subjects
     *
     * @param numberOfTeachingSubjects
     */
    public void setNumberOfTeachingSubjects(int numberOfTeachingSubjects) {
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
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
