class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){

            if(i > 0 && nums[i] == nums[i-1])    continue;
            int current = nums[i];
            int l = i+1;
            int r = nums.length-1;

            while(l < r){
                int sum = nums[l] + nums[r] + current;

                if(sum == 0){
                    result.add(Arrays.asList(current, nums[l], nums[r]));
                    l++;
                    r--;

                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }

                    while(l < r && nums[r] == nums[r+1]){
                        r--;
                    }
                }else if(sum > 0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return result;
    }
}