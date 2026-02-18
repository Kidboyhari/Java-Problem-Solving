// 


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        // Read initial list
        List<Integer> list = new ArrayList<>();
        String[] initialElements = scanner.nextLine().split(" ");
        for (String element : initialElements) {
            list.add(Integer.parseInt(element));
        }
        
        // Read number of queries
        int q = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < q; i++) {
            String operation = scanner.nextLine().trim();
            
            if (operation.equals("Insert")) {
                String[] parts = scanner.nextLine().trim().split(" ");
                int index = Integer.parseInt(parts[0]);
                int value = Integer.parseInt(parts[1]);
                list.add(index, value);
            } else if (operation.equals("Delete")) {
                String[] parts = scanner.nextLine().trim().split(" ");
                int index = Integer.parseInt(parts[0]);
                if (index >= 0 && index < list.size()) {
                    list.remove(index);
                }
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}
