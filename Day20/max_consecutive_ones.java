class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;
        int max_count=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==1){
                count++;
                
                if(max_count<count){
                    max_count=count;
                }
            }
            else{
                count=0;
            }
        }
        return max_count;
    }
}