class Solution {
    public boolean isSubsequence(String s, String t) {

        String add = "";
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = number; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    add += s.charAt(i);
                    number = j+1;
                    break;
                }
            }
        }
        if ((s.equals(add)) && (s.length() == add.length()))
            return true;
        else
            return false;
    }
}