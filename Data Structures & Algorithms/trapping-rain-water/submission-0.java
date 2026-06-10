class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1,lmax=0,rmax=0,t=0;
        while(l<r){
            if(height[l]<=height[r]){
                if(lmax>height[l]){
                    t+=lmax-height[l];
                }
                else{
                    lmax=height[l];
                }
                l++;
            }
            else{
                if(rmax>height[r]){
                    t+=rmax-height[r];
                }
                else{
                    rmax=height[r];
                }
                r--;
            }

        }
        return t;
    }
}
