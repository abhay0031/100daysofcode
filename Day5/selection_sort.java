// selection sort

// selection sort is opposite of bubble sort
// selection sort takes smallest element and it takes to start of the array
// one swap per iteration
// takes smallest at index 0 assume and swap the smallest element from the list and update it and swap
// and then in second loop takes the next element at index 1 because index 0 is sorted already in first loop

// time complexity: O(n^2)
// space complexity:O(1)

import java.util.*;

public class selection_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            int smallest = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            // swap to ith position that is 0 ,1,2,indexes
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
