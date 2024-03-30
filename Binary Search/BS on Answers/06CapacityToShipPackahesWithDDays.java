// MEDIUM
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = Arrays.stream(weights).max().getAsInt();;
        int end = 0;
        for(int num: weights) {
            end += num;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int daysCount = getDays(weights, mid);
            if(daysCount <= days) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
    public int getDays(int[] arr, int cap) {
        int daysCount = 1;
        int load = 0;
        for(int i = 0; i<arr.length; i++) {
            if(load + arr[i] > cap) {
                daysCount++;
                load = arr[i];
            }else {
                load += arr[i];
            }
        }
        return daysCount;
    }
}
