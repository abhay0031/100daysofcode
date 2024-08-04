class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // first method-> brute force

    //     for(int i=0;i<nums.length;i++){

    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]+nums[j]==target){

    //                 int a[]={i,j};
    //                 return a;
    //             }

    //         }
    //     }
    //     return null;

    // second method hashmap time complexity o(nlogn) but in unordered map scenario it might go upto o(n^2)


    
    
    HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int moreNeeded = target - num;

            if (mpp.containsKey(moreNeeded)) {
                return new int[]{mpp.get(moreNeeded), i};
            }
            mpp.put(num, i);
        }
        return new int[]{-1, -1};





    // optimal solution -> time complexity O(n)  2 pointers approach i.e greedy approach
    // using sort for increment and decrement purpose





    }
}