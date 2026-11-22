class Solution {
    public int missingNumber(int[] nums) {
        int actualSum=0;
        for(int i:nums){
            actualSum += i;
        }
        int n = nums.length;
        int sum = n*(n+1)/2;
        int missing = sum - actualSum;

        return missing;
    }
}