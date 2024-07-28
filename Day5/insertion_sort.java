// insertion sort
// read below first
// insertion sort contains two parts 
// one is sorted and another one is unsorted
// take one element from unsorted part and take it sorted part and sort it
// first takes sorted part at index 0 element and compare if i > i+1 if greater then swap and then  sorted part will increase
//  and then another comparison will occur in all sorted portion and then again sorting will happen

// note comparison of element in sorted part will get compared to all elements in sorted part

// time complexity:O(n^2)
// space complexity:O(1)

import java.util.Scanner;

public class insertion_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int current = arr[i]; // it is the unsorted part that is to be sorted
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than current,
            // to one position ahead of their current position

            while (j >= 0 && arr[j] > current) { // to take track of sorted part
                arr[j + 1] = arr[j];
                j--;
            }
            // Place current at its correct position
            arr[j + 1] = current;
        }

        System.out.println("The sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
