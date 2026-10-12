class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int[] hash = new int[max + 1];

        for(int i=0; i<n; i++){
            hash[nums[i]]++;
        }

        for(int i=min; i<=max; i++){
            if(hash[i] == 0){
                ans.add(i);
            }
        }
        return ans;
    }
}