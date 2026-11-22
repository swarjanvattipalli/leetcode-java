class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            for(int j=1;j<strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != c){
                    return str.substring(0, i);
                }
            }
        }

        return str;
    }
}