class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;

        while(i < nums.length){
            if(nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i]-1]){
                int correctindex = nums[i]-1;

                int temp = nums[i];
                nums[i] = nums[correctindex];
                nums[correctindex] = temp;
            }else{
                i++;
            }
        }

        for(int j=0;j<n;j++){
            if(j+1 != nums[j]){
                return j+1;
            }
        }

        return n+1;
    }
}