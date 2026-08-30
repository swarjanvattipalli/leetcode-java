class Solution {
  public int subarraysWithKDistinct(int[] nums, int k) {
    return subarraysWithAtMostKDistinct(nums, k) - subarraysWithAtMostKDistinct(nums, k - 1);
  }

    public int subarraysWithAtMostKDistinct(int[] nums, int k){
        Map<Integer, Integer> mp = new HashMap<>();
        int l = 0;
        int r = 0;
        int count = 0;
        while(r < nums.length){
            mp.put(nums[r], mp.getOrDefault(nums[r], 0)+1);

            while(mp.size() > k){
                mp.put(nums[l], mp.get(nums[l])-1);
                if(mp.get(nums[l]) == 0){
                    mp.remove(nums[l]);
                }
                l++;
            }

            count = count + r - l + 1;
            r++;
        }

        return count;
    }
  }