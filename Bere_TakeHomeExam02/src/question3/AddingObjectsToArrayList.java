/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author keerthi prayojitha bere
 */
public class AddingObjectsToArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Object> arr = new ArrayList<>();
        Loan loan = new Loan(3000);
        Circle circle = new Circle(5);
        String str = "question3";
        Date date = new Date();
        arr.add(loan);
        arr.add(circle);
        arr.add(str);
        arr.add(date);
        System.out.println("Answer for question 3:");
        for (Object ob : arr) {
            System.out.println(ob.toString());
        }

    }

}
