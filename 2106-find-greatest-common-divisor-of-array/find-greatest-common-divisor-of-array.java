class Solution {
    public int findGCD(int[] nums) {
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            smallest = Math.min(smallest, nums[i]);
            largest = Math.max(largest, nums[i]);
        }

        if(largest % smallest == 0) return smallest;
        else {
            for(int i=smallest; i>=2; i--){
                if(smallest % i == 0 && largest % i == 0) return i;
            }
        }
        return 1;
    }
}