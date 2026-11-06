class Solution {
    public int longestConsecutive(int[] nums) {

        int count = 0;
        int lastSmallest = Integer.MIN_VALUE;
        int longest = 0;

        Arrays.sort(nums);


        for(int i=0; i<nums.length; i++){
            
            if(nums[i] - 1 == lastSmallest){
                count += 1;
                lastSmallest = nums[i];
            }
            else if(nums[i] != lastSmallest){
                lastSmallest = nums[i];
                count = 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}