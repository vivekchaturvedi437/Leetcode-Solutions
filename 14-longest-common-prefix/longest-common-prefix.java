class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String s1 = strs[0];//this is 1'st ele. of array
        String s2 = strs[strs.length-1];// this is last ele. of array

        int idx = 0;

        while(idx < s1.length() && idx < s2.length()){//we need to check both strings
            if(s1.charAt(idx) == s2.charAt(idx)) idx++;
            else break;
        }
        return s1.substring(0, idx);
    }
}