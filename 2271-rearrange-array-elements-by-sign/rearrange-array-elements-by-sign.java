class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] positiveArray = new int[nums.length / 2];
        int[] negativeArray = new int[nums.length / 2];

        int positiveArrayCount = 0;
        int negativeArrayCount = 0;

        for (int num : nums) {
            if (num > 0) {
                positiveArray[positiveArrayCount++] = num;
            } else
                negativeArray[negativeArrayCount++] = num;
        }

        int[] finalArray = new int[nums.length];

        int p = 0, n = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                finalArray[i] = positiveArray[p++];
            else
                finalArray[i] = negativeArray[n++];
        }
        return finalArray;
    }
}