class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int low = 0;
        int high = nums.size()-1 ;
        int mid = 0;

        while (low <= high) {
            mid = low+(high-low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else
                high=mid-1;
        }
        
        return low;  // always return low as if element not found then it will return the proper index
    }
};