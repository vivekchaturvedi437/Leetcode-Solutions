class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> anS = new ArrayList<>();

        int max = 0;
        for(int i=0; i<candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        
        for(int i=0; i<candies.length; i++){

            Boolean ans = false;
            
            if(candies[i] + extraCandies >= max){
                ans = true;
            } else {
                ans = false;
            }
            anS.add(ans);
        }
        return anS;
    }
}