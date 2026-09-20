// You are given a class Solution and an inner class Inner.Private. The main method of class Solution takes an integer  as input. The powerof2 in class Inner.Private checks whether a number is a power of . You have to call the method powerof2 of the class Inner.Private from the main method of the class Solution.

// Constraints

// Sample Input

// 8
// Sample Output

// 8 is power of 2
// An instance of class: Solution.Inner.Private has been created

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class Solution {

    private static class Inner {

        private class Private {

            private void powerof2(int num) {

                if (num > 0 && (num & (num - 1)) == 0) {
                    System.out.println(num + " is power of 2");
                } else {
                    System.out.println(num + " is not a power of 2");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // Create an object of the private inner class
        Inner inner = new Inner();
        Inner.Private privateObject = inner.new Private();

        // Call the private method using reflection
        try {

            Method method = privateObject.getClass()
                    .getDeclaredMethod("powerof2", int.class);

            method.setAccessible(true);

            method.invoke(privateObject, num);

            System.out.println(
                "An instance of class: "
                + privateObject.getClass().getName()
                + " has been created"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}