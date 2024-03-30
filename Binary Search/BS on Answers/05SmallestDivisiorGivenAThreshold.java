// MEDIUM
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Arrays.stream(nums).max().getAsInt();
        int start = 1;
        int end = max;
        while(start <= end) {
            int mid = (start + end) / 2;
            int sum = sum(nums, mid);
            if(sum <= threshold) {
                end = mid - 1; 
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    public int sum(int[] arr, int n) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] % n == 0) {
                sum += arr[i] / n;
            } else {
                sum += (arr[i] / n) + 1;
            }
        }
        return sum;
    }
}