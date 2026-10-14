class Solution {
    public int[] transformArray(int[] nums) {

        int even = 0;
        int odd = 0;

        int[] arr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0) even++;
            else odd++;
        }

        for(int i=0; i<even; i++){
            arr[i] = 0;
        }
        for(int i=even; i<odd+even; i++){
            arr[i] = 1;
        }
        return arr;
    }
}