class Solution {
    public static int binarySearch(int l,int r,int[] nums,int t){
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==t){
                return m;
            }
            else if(nums[m]>t){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(0,nums.length-1,nums,target);
    }
}
