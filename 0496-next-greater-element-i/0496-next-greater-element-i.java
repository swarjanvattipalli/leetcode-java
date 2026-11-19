class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        for(int i=0;i<nums1.length;i++){
            int l=0;
            while(nums2[l] != nums1[i]){
                l++;
            }
        
            l++;
            while(l < nums2.length){
                if(nums2[l] > nums1[i]){
                    result[i] = nums2[l];
                    break;
                }
                l++;
            }
        }

        return result;
    }
}