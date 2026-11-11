class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // String str = s.toLowerCase();
        int l=0;
        int r=s.length()-1;

        while(l < r){
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))  return false;
            l++;
            r--;
        }

        return true;
    }
}