package question2;

import java.util.Scanner;

/**
 *
 * @author keerthi prayojitha bere
 */
public class TwoDimensionalArrayComparision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];
        System.out.println("Answer for question 2:");
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2[i][j] = sc.nextInt();
            }
        }
        if (equal(list1, list2)) {

            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equal(final int[][] m1, final int[][] m2) {
        if (m1 == null) {
            return false;
        }
        if (m2 == null) {

            return false;
        }
        if (m1.length != m2.length) {

            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 1; j < m2.length; j++) {
                if (!(m1[i][j] == m2[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
