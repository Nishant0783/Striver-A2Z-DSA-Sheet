// MEDIUM
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)(bloomDay.length) < (long)((long)(m)*(long)(k))) {
            return -1;
        }
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int min = Arrays.stream(bloomDay).min().getAsInt();
        int start = min;
        int end = max;
        while(start <= end) {
            int mid = (end + start) / 2;
            if(possible(bloomDay, m, k, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public boolean possible(int[] arr, int m, int k, int day) {
        int n = arr.length;
        int flowersBloomed = 0;
        int boqCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                flowersBloomed++;
            } else {
                boqCount += (flowersBloomed / k);
                flowersBloomed = 0;
            }
        }
        boqCount += (flowersBloomed / k);
        return boqCount >= m;
    }

}