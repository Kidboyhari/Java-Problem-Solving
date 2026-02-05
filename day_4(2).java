// 

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNum = 1;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(lineNum + " " + line);
            lineNum++;
        }
        sc.close();
    }
}
