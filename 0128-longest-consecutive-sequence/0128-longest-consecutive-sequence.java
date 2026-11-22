class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int maxCount = 0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int i:set){
            
            int count = 0;
            if(!set.contains(i-1)){
                count++;
                while(set.contains(i+1)){
                    count++;
                    i++;
                }
                maxCount = Math.max(count, maxCount);
            }
            
        }

        return maxCount;
    }
}