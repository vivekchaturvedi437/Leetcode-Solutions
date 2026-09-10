class Solution {
    public int differenceOfSum(int[] nums) {

        int eleSum = 0;
        int digSum = 0;
        
        for(int i=0; i<nums.length; i++){
            int digit = 0;

            eleSum += nums[i];

            int num = nums[i];

            if(nums[i] > 9){
            
                while(num>0){
                    int temp = num % 10;
                    digit += temp;
                    num /= 10;
                }
                digSum += digit;
            }
            else {
                digSum += nums[i];
            }
        }
        return eleSum - digSum;
    }
}