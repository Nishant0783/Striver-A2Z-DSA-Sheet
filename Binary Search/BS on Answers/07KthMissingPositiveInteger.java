// EASY
// https://leetcode.com/problems/kth-missing-positive-number

class Solution {
    public int findKthPositive(int[] arr, int k) {
        // Brute Force
        // for(int i= 0; i<arr.length; i++) {
        //     if(arr[i] <= k) {
        //         k++;
        //     } else {
        //         break;
        //     }
        // }

        // return k;


        // Optimal

        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return k + end + 1;
    }
}