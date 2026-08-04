class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int[] result = new int[nums.length];
        int index = r;
        while(l <= r){
            int rsquare = nums[r] * nums[r];
            int lsquare = nums[l] * nums[l];
            if(lsquare > rsquare){
                result[index] = lsquare;
                l++;
            }else{
                result[index] = rsquare;
                r--;
            }

            index--;
        }

        return result;
    }
}
