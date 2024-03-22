// EASY
// https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383

public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int ans = n;
        int start = 0;
        int end = n-1;
        while(start <= end) {
            int mid = (end + start) / 2;
            if(arr[mid] > x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
