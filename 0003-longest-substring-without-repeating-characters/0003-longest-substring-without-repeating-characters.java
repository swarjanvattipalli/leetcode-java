class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxLen = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int index = s.substring(l, i).indexOf(c);
            if(index != -1){
                l = l+index+1;
            }

            maxLen = Math.max(maxLen, i-l+1);
        }

        return maxLen;
    }
}