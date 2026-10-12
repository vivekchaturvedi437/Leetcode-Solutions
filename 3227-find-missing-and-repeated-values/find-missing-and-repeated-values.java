class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length; 
        int total = n*n;

        int[] hash = new int[total+1];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                hash[grid[i][j]]++;
            }
        }

        int repeating = -1;
        int missing = -1;

        for(int i=1; i<=total; i++){
            if(hash[i] == 2) repeating = i;
            else if(hash[i] == 0) missing = i;
        }
        return new int[]{repeating, missing};
    }
}