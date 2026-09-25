class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1; i<=numRows; i++){
            List<Integer> ansRow = new ArrayList<>();

            long value = 1;
            ansRow.add(1);

            for(int col=1; col<i; col++){
                value = value*(i-col);
                value = value/col;

                ansRow.add((int) value);
            }
            ans.add(ansRow);
        }
        return ans;
    }
}