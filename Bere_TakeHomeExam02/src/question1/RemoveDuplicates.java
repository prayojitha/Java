/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author keerthi prayojitha bere
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Answer for question 1:");
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        removeDuplicate(list);
    }

    /**
     * This is a method to remove duplicate elements from array list.
     *
     * @param list
     */
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        System.out.println("The distinct integers are " + list);

    }
}
