// EASY
// https://leetcode.com/problems/search-insert-position/description/

// Exactly same as lower bound

class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target) {
                ans = mid;
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}