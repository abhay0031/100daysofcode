import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int num : nums1) {
            ans.add(num);
        }

        for (int num : nums2) {
            ans.add(num);
        }

        Collections.sort(ans);

        int size = ans.size();
        if (size % 2 == 0) {
            return (double) (ans.get(size / 2) + ans.get(size / 2 - 1)) / 2;
        } else {
            return (double) ans.get(size / 2);
        }
    }
}
