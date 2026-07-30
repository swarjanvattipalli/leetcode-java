class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int l = 0;
        int maxLen = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            while(chars.contains(c)){
                chars.remove(s.charAt(l));
                l++;
            }

            chars.add(c);
            maxLen = Math.max(maxLen, chars.size());
        }

        return maxLen;
    }
}