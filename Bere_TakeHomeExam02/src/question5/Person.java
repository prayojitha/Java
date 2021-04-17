/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author keerthi praayojitha bere
 */
public class Person {

    String name;
    String address;
    String phoneNumber;
    String emailAddress;

    /**
     * this is a getter method to get name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * this is a setter method to set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this is a getter method to get Address
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * this is a setter method to set Address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * this is a getter method to get Phone number
     *
     * @return phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * this is a method to set phone number
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * this is a method to get email address
     *
     * @return email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * this is a method to get email address
     *
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * this is a parameterized constructor
     *
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    /**
     * this is a toString() method
     *
     * @return
     */
    @Override
    public String toString() {
        return this.getClass() + " name= " + name;
    }

}
