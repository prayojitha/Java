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
public class CarSpeed {

    public static void main(String[] args) {
        System.out.println("Answer for question 7:");
        Speed mySpeed = Speed.LOW;
        System.out.println(mySpeed.value);
        for (Speed mySpeed1 : Speed.values()) {
            System.out.println(mySpeed1);
        }
        Speed mySpeed2 = Speed.MEDIUM;
        switch (mySpeed2) {
            case LOW:
                System.out.println("Low Speed");
                break;
            case MEDIUM:
                System.out.println("Medium Speed");
                break;
            case HIGH:
                System.out.println("High Speed");
                break;
        }
    }
}
