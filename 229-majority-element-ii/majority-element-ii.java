class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int target = nums.length / 3;

        for (int i = 0; i < nums.length; i++) {
            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > target) {
                if (!ans.contains(nums[i])) {
                    ans.add(nums[i]);
                }
            }
        }
        return ans;
    }
}