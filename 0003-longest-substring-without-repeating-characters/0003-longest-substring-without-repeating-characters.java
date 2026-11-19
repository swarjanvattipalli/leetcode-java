class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int l = 0;
        Set<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            count = Math.max(set.size(), count);
        }

        return count;
    }
}