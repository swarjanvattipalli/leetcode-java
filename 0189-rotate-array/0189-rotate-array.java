class Solution {
    private int[] nums;

    public void rotate(int[] nums, int k) {
        this.nums = nums;

        k = k % nums.length;

        reverse(0, nums.length - 1);
        reverse(0, k - 1);
        reverse(k, nums.length - 1);
    }

    private void reverse(int i, int j) {
        while (i < j) {
            int temp = this.nums[i];
            this.nums[i] = this.nums[j];
            this.nums[j] = temp;

            i++;
            j--;
        }
    }
}