class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if(n == 0) return 0;

        int longest = 1;

        HashSet<Integer> st = new HashSet<>();

        for(int num : nums){
            st.add(num);
        }

        for(int it : st){
            
            if(!st.contains(it-1)){
                int count = 1;
                int x = it; 

                while(st.contains(x+1)){
                x = x+1;
                count += 1;
            }
                        longest = Math.max(count, longest);

            }

        }
        return longest;
    }
}