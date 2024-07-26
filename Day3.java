import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        int left = 0;
        for (int right = 1; right < n; right++) {
            if (arr[left] != arr[right]) {
                left++;
                arr[left] = arr[right];
            }
        }
        int x = left + 1;

        
        if (k > 0 && k <= x) {
            
            System.out.println("kth Minimum element is: " + arr[k - 1]);
            System.out.println("kth Maximum element is: " + arr[x- k]);
        } else {
            System.out.println("Invalid value of k. Please enter a value between 1 and " + x);
        }

       
    }
}
