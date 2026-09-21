class Solution {
    public int missingNumber(int[] nums) {

        int number = 0;

        for (int i = number; i <= nums.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (number == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return number;
            number++;

        }
        return -1;
    }
}