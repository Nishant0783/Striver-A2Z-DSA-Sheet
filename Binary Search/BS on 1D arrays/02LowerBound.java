// EASY
// https://www.codingninjas.com/studio/problems/lower-bound_8165382

public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int ans = n;
        int start = 0;
        int end = n-1;
        while(start <= end) {
            int mid = (end + start) / 2;
            if(arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}