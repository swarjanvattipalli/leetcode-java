class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];

        int minProduct = nums[0];
        int maxProduct = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] < 0){
                int temp = minProduct;
                minProduct = maxProduct;
                maxProduct = temp;
            }
            maxProduct = Math.max(nums[i], maxProduct*nums[i]);
            minProduct = Math.min(nums[i], minProduct*nums[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}