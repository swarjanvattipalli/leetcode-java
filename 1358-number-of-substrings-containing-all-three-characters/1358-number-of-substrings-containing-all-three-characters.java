class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = {-1, -1, -1};
        int count = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c - 'a'] = i;
            if(freq[0] != -1 && freq[1] != -1 && freq[2] != -1){
                int minIndex = Math.min(freq[0], Math.min(freq[1], freq[2]));
                count = count + 1 + minIndex;
            }
        }

        return count;
    } 
}