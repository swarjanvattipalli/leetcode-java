class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i: nums){
            if(i == 0)
                count0++;
            else if(i == 1)
                count1++;
            else
                count2++;
        }

        Arrays.fill(nums, 0, count0, 0);
        Arrays.fill(nums, 0+count0, count0+count1, 1);
        Arrays.fill(nums, 0+count0+count1, count0+count1+count2, 2);
    }
}