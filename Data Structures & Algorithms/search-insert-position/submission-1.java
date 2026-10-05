class Solution {
    public int binarySearch(int l,int r,int[] nums,int t){
        int res=nums.length;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==t)    {
                return m;
            }
            else if(nums[m]>t){
                res=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res;
    }
    public int searchInsert(int[] nums, int target) {
        return binarySearch(0,nums.length-1,nums,target);
    }
}