class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> sumMap = new HashMap<>();

        sumMap.put(0,1);
        int result = 0;
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            result += sumMap.getOrDefault(sum-goal, 0);
            sumMap.put(sum, sumMap.getOrDefault(sum, 0)+1);
        }

        return result;
    }
}