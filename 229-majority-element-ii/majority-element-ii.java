class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0, count2 = 0;
        int ele1 = 0, ele2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == ele1) {
                count1++;
            }
            else if (nums[i] == ele2) {
                count2++;
            }
            else if (count1 == 0) {
                count1++;
                ele1 = nums[i];
            }
            else if (count2 == 0) {
                count2++;
                ele2 = nums[i];
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == ele1) {
                count1++;
            }
            else if (num == ele2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();

        if (count1 > nums.length / 3) {
            result.add(ele1);
        }

        if (count2 > nums.length / 3) {
            result.add(ele2);
        }

        return result;
    }
}