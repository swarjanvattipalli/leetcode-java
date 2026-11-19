class Solution {

    public boolean anagram(String s, String p){
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
            arr[p.charAt(i) - 'a']--;
        }

        for(int i=0;i<26;i++){
            if(arr[i] != 0){
                return false;
            }
        }

        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        int l = 0;
        int r = s.length();
        int n = p.length();
        List<Integer> list = new ArrayList<>();

        while(l < r-n+1){
            if(anagram(s.substring(l, l+n), p)){
                list.add(l);
            }
            l++;
        }

        return list;
    }
}