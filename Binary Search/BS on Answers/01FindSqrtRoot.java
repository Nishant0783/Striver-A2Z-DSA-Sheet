// EASY
//https://leetcode.com/problems/sqrtx/description/

class Solution {
    public int mySqrt(int x) {
        if(x == 1) {
            return x;
        }
        int start = 1;
        int end = (x);
       
       
        while(start <= end) {
            long mid = start + (end - start)/2;
            long val = mid * mid;
            if (val <= (long)(x)) {
                start = (int)(mid + 1);
            } else {
                end = (int)(mid - 1);
            } 
        }
        return end; 
    }
}