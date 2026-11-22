class Solution {
    public void reverse(int[] nums, int st, int end){
        while(st < end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int r = nums.length-2;

        while(r >= 0 && nums[r] >= nums[r+1]){
            r--;
        }

        if(r >= 0){
            int j = nums.length-1;

            while(nums[j] <= nums[r]){
                j--;
            }

            int temp = nums[j];
            nums[j] = nums[r];
            nums[r] = temp;
        }

        reverse(nums, r+1, nums.length-1);
    }
}