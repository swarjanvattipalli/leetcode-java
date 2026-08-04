class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        char[] chars = s.toLowerCase().toCharArray();
        int l = 0;
        for(int i=chars.length-1;i>=l;i--,l++){
            if(chars[i] != chars[l]){
                return false;
            }
        }

        return true;
    }
}