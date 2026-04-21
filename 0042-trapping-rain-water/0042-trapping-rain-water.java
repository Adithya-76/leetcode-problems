class Solution {
    public int trap(int[] height) {
        int lmax = 0;
        int rmax = 0;
        int l = 0;
        int r = height.length-1;
        int count = 0;
        while(l<r){
            if(height[l]>lmax){
                lmax = height[l];
            }
            if(height[r] > rmax){
                rmax = height[r];
            }
            if(height[l]<height[r]){
                count = count + lmax - height[l];
                l++;
            }
            else{
                count = count+rmax-height[r];
                r--;
            }
        }
        return count;
    }
}