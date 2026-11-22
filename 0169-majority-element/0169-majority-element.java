class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            if(count == 0){
                count++;
                majority = current;
                continue;
            }

            if(current != majority){
                count--;
            }else if(current == majority){
                count++;
            }
        }

        return majority;
    }
}