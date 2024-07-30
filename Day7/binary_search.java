import java.util.*;
public class binary_search {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int []arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int start=0;
        int end=n-1;
        int x=sc.nextInt();
        int index=-1;


        while (start<=end) {
            int mid=start+(end-start)/2;

            if (arr[mid]==x) {
                index=mid;
                break;

            }
            else if (arr[mid]<x) {
                start=mid+1;
                
                
            }
            else{
                end=mid-1;
            }
        }
        if (index!=-1) {
            System.out.println("Element found at index "+index);

            
        }
        else{

            System.out.println("Element not found");
        }

    }
    
}
