class Solution {
    public int lengthOfLastWord(String s) {

        int count=0;
        int skip=1;

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(s.length()-skip)==' '){
                skip++;
                continue;
            }
            if(s.charAt(i)==' ') break;
            count++;
        }
        return count;
    }
}