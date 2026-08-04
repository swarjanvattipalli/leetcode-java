class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r = height.length-1;
        int maxWater = 0;
        while(l<=r){
            int left = height[l];
            int right = height[r];
            int h = left > right ? right : left;
            int w = r - l;

            maxWater = Math.max(h*w ,maxWater);
            if(left > right){
                r--;
            }else{
                l++;
            }
        }


        return maxWater;
    }
}