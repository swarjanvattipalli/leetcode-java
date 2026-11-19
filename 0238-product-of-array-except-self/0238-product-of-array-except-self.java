class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod1 = new int[nums.length+1];
        int[] prod2 = new int[nums.length];

        prod1[0] = 1;
        int prod = 1;
        for(int i=0;i<nums.length;i++){
            prod = prod * nums[i];
            prod1[i+1] = prod;
        }

        prod = 1;
        for(int i=nums.length-1;i>=0;i--){
            int preProduct = prod1[i];
            prod2[i] = prod * preProduct;
            prod = prod*nums[i];
        }

        return prod2;
    }
}