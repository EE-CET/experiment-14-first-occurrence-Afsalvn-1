
import java.util.Scanner;

public class FirstOccurrence {

    // Task: Find the 1-based position of the first occurrence of K
    public int findFirstOccurrence(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                // Return position (index + 1) as requested by the problem
                return i + 1; 
            }
        }
        // Return -1 if K is not present in the array
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read N (size) and K (target)
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] arr = new int[n];
            
            // Read array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            FirstOccurrence solver = new FirstOccurrence();
            System.out.println(solver.findFirstOccurrence(arr, n, k));
        }
        
        sc.close();
    }
}
