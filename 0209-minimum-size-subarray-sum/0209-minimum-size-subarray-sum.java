class Solution {
  public int minSubArrayLen(int target, int[] nums) {
    int sum = 0;
    int minSize = Integer.MAX_VALUE;
    int l = 0;
    for(int i=0;i<nums.length;i++){
        sum += nums[i];

        while(sum >= target){
            minSize = Math.min(minSize, i-l+1);
            sum = sum-nums[l];
            l++;
        }
    }

    return minSize == Integer.MAX_VALUE ? 0 : minSize;
  }
}