class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxLength = 0;
        for(int i=0;i<fruits.length;i++){
            hm.put(fruits[i], hm.getOrDefault(fruits[i], 0)+1);
            while(hm.size() > 2){
                int k = hm.get(fruits[l]);
                if(k <= 1){
                    hm.remove(fruits[l]);
                }else{
                    hm.put(fruits[l], k-1);
                }

                l++;
            }
            maxLength = Math.max(i-l+1, maxLength);
        }

        return maxLength;
    }
}