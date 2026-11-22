class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int minProd = nums[0];
        int maxProd = nums[0];


        for(int i=1;i<nums.length;i++){
            if(nums[i] < 0){
                int temp = minProd;
                minProd = maxProd;
                maxProd = temp;
            }

            minProd = Math.min(nums[i], nums[i]*minProd);
            maxProd = Math.max(nums[i], nums[i]*maxProd);

            result = Math.max(maxProd, result);
        }

        return result;
    }
}