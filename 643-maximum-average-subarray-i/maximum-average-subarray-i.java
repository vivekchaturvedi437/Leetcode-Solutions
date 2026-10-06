class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int largestSum = Integer.MIN_VALUE;

        int start = 0;

        while (start <= nums.length - k) {

            int sum = 0;

            for (int i = start; i < start + k; i++) {
                sum += nums[i];
            }

            largestSum = Math.max(sum, largestSum);

            start++;
        }

        return (double) largestSum / k;
    }
}