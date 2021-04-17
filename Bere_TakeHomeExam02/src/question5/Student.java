/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author keerthiprayojitha bere
 */
public class Student extends Person {

    String grade;
    public static final String STATUS = "Graduate";

    /**
     * this is a parameterized constructor with super class attributes
     *
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     * @param grade
     */
    public Student(String name, String address, String phoneNumber, String emailAddress, String grade) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    /**
     * this is a getter method to get grade
     *
     * @return grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * this is a setter method to set grade
     *
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * this is a toString() method
     *
     * @return
     */
    @Override
    public String toString() {
        return getClass() + "= " + super.name;
    }

}
