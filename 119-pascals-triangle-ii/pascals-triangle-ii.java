class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<>();

        long res = 1;
        int n = rowIndex;
        ans.add(1);

        for(int i=1; i<=n; i++){
            res = res*(n-i+1);
            res /= i;
            ans.add((int)res);
        }
        return ans;
    }
}