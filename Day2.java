import java.util.*;
public class Day2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (max<arr[i]) {
                max=arr[i];
                
            }
        }

        System.out.println("Max value of the array is: "+max);
        System.out.println("Min value of the array is: "+min);
    }
}
