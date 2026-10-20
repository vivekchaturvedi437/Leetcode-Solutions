class Solution {
    public int countOdds(int low, int high) {

        int value = high - low;
        
        if(low % 2 == 0 && high % 2 == 0){
            value /= 2;
        } else {
            value = (value/2)+1;
        }
        return value;
    }
}