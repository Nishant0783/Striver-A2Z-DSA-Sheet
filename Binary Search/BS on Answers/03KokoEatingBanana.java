// MEDIUM
// https://leetcode.com/problems/koko-eating-bananas/submissions/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int start = 0; 
        int end = max-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int totalHours = getTotalHours(piles, mid);
            if(totalHours <= h) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int getTotalHours(int[] piles, int x) {
        int totalHours = 0;
        for(int i = 0; i<piles.length; i++) {
            totalHours += Math.ceil((double)(piles[i]) / (double)(x));
        }
        return totalHours;
    }

}