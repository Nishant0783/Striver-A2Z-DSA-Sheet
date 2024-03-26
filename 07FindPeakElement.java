// MEDIUM
// https://leetcode.com/problems/find-peak-element/

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        // If array has one element
        if(n == 1) return 0;

        // If peak on left
        if(nums[0] > nums[1]) return 0;

        // If peak on right
        if(nums[n-1] > nums[n-2]) return n-1;

        // Binary search for 1 to n-2
        int start = 1;
        int end = n-2;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid;
            } else if(nums[mid] > nums[mid-1]){
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        } 
        return -1;      
    }
}