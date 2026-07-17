class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int n = nums.length;
    
    int[] ans = new int[nums.length];
    int j=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){ 
                ans[j] = nums[i];
                j++;
            } else {
                n--;
                ans[n] = nums[i];
            }
        }
        return ans;
    }
}