// We define the following terms:

// Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:

// For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

// A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
// Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

// Function Description

// Complete the getSmallestAndLargest function in the editor below.

// getSmallestAndLargest has the following parameters:

// string s: a string
// int k: the length of the substrings to find
// Returns

// string: the string ' + "\n" + ' where and are the two substrings
// Input Format

// The first line contains a string denoting .
// The second line contains an integer denoting .

// Constraints

//  consists of English alphabetic letters only (i.e., [a-zA-Z]).
// Sample Input 0

// welcometojava
// 3
// Sample Output 0

// ava
// wel
// Explanation 0

// String  has the following lexicographically-ordered substrings of length :

// We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

// The stub code in the editor then prints ava as our first line of output and wel as our second line of output.

// Language
// Java 7
// More
// 14567891011121314151617181920212223242526272829303132333435
// import java.util.Scanner;

// public class Solution {
// import java.util.Scanner;

// public class Solution {

//     public static String getSmallestAndLargest(String s, int k) {
//         String smallest = s.substring(0, k);
//         String largest = s.substring(0, k);
        
//         for (int i = 1; i <= s.length() - k; i++) {

// Line: 4 Col: 1

// Test against custom input
// BlogScoringEnvironment
import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {

        // First substring
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Check all substrings
        for (int i = 1; i <= s.length() - k; i++) {

            String current = s.substring(i, i + k);

            // Compare alphabetically
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int k = scan.nextInt();

        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}