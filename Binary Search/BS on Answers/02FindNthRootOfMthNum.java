// EASY
// https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1

class Solution
{
    public int NthRoot(int n, int m)
    {
        if(m == 1) {
            return 1;
        }
        // code here
        int start = 1;
        int end = m/n;
        while(start <= end) {
            long mid = start + (end-start) / 2;
            long val = (long)Math.pow(mid, n);
            if(val == (long)m) {
                return (int)(mid);
            } else if(val < (long)(m)){
                start = (int) (mid + 1);
            }else {
                end = (int) (mid - 1);
            }
        } 
        return -1;
    }
}