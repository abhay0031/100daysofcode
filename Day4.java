// import java.util.*;
// public class Day4 {
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);

//         String str=sc.nextLine();

//         StringBuilder rev=new StringBuilder(str);

//         int left=0;
//         int right=str.length()-1;

//         while (left<right) {

//             char temp=rev.charAt(left);
//             rev.setCharAt(left, rev.charAt(right));
            
//             rev.setCharAt(right, temp);

//             left++;
//             right--;

            
//         }

//         System.out.println(rev);
//     }    
// }


import java.util.Scanner;

public class Day4 {

    public static void rev(String str, int idx) {
        if (idx < 0) {
            return;
        }
        
        System.out.print(str.charAt(idx));
        
        rev(str, idx - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = str.length() - 1;

        rev(str, n);
    }
}
