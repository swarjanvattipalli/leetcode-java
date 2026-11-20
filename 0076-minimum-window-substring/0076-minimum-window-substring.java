class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();
        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int count = t.length();
        int l = 0;
        int r = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        while(r < s.length()){
            char c = s.charAt(r);

            if(map.containsKey(c)){
                if(map.get(c) > 0){
                    count--;
                }
                map.put(c, map.get(c)-1);
            }

            r++;
            while(count==0){
                if(r - l < minLen){
                    minLen = r-l;
                    start = l;
                }

                char leftChar = s.charAt(l);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar)+1);
                    if(map.get(leftChar) > 0){
                        count++;
                    }
                }
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start+minLen);
    }
}