// bubble sort takes maximum element and takes it to end 
// by comparing adjacent element loop goes n-1 times


// bubble sort time complexity : O(n^2)
// space complexit:O(1)

import java.util.*;

public class bubble_sort{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();

        int []arr=new int[n];

        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {   //for arrangements bubble arrangements
            
            for (int j = 0; j < n-i-1; j++) {    // for sorting the elements -i because not taking in account the sorted elements
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

    }
}