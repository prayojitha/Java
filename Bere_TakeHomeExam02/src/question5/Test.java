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
public class Test {

    /**
     * @param args the command line arguments
     */
    static Person person;
    static Student student;
    static Employee employee;
    static Faculty faculty;
    static Staff staff;

    public static void main(String[] args) {
        person = new Person("mike", "willow road", "9123455869", "mike@gmail.com");
        student = new Student("dustin", "san jose", "3456789234", "dustin@gmail.com", "A");
        employee = new Employee("suzie", "plankton", "4567890123", "suzie@gmail.com", 111, 1000.00, LocalDate.of(2018, 12, 8));
        faculty = new Faculty("suzie", "plankton", "4567890123", "suzie@gmail.com", 111, 1000.00, LocalDate.of(2018, 12, 8), 9, 3);
        staff = new Staff("Professor", "mike", "willow road", "9123455869", "mike@gmail.com", 111, 1000.00, LocalDate.of(2018, 12, 8));
        System.out.println("Answer for question 5:");
        System.out.print(person.toString() + "\n " + student.toString() + "\n " + employee.toString() + "\n " + faculty.toString() + "\n " + staff.toString());
    }

}
