// MEDIUM
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start = 0; 
        int end = nums.length - 1;
        int ans[] = new int[2];
        Arrays.fill(ans, -1);
        
        if(nums.length == 1 && nums[0] == target) {
            Arrays.fill(ans, 0);
            return ans;
        } else if(nums.length == 1 && nums[0] != target) {
            Arrays.fill(ans, -1);
            return ans;
        }

        while(start <= end) { 
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                int ptrInc = mid;
                int ptrDec = mid;
                ans[0] = mid;
                ans[1] = mid;
                if(nums[ptrInc] == target) {
                    while(ptrInc <= end && nums[ptrInc] == target) {
                        ans[1] = ptrInc;
                        ptrInc++;
                    }
                   
                }
                if(nums[ptrDec] == target) {
                    while(ptrDec >= start && nums[ptrDec] == target) {
                        ans[0] = ptrDec;
                        ptrDec--;
                    }
                }
                return ans;
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
