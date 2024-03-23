// MEDIUM
// https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401

// Ciel value - same as lower boud.
// Floor value - largest element which is smaller than or equal to target value.

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Write your code here.
      int start = 0;
      int end = n - 1;
      int ans[] = new int[2];
      ans[0] = -1;
      ans[1] = -1;
      while(start <= end) {
          int mid = start + (end - start) / 2;
          if(a[mid] == x) {
            ans[0] = a[mid];
            ans[1] = a[mid];
            return ans;
          } else if(a[mid] > x){
            ans[1] = a[mid];
            end = mid - 1; 
          } else {
            ans[0] = a[mid];
            start = mid + 1;
          }
      }
      return ans;
    }
    
}
