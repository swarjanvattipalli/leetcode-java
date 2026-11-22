class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] arr = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int i = arr.length-1;

        while(i >= 0){
            sb.append(arr[i]+" ");
            i--;
        }

        return sb.toString().trim();
    }
}