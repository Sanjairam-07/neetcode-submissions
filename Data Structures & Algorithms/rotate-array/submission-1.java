class Solution {
    public void helper(int[] nums,int st,int en){
        while(st<=en){
            int temp=nums[st];
            nums[st]=nums[en];
            nums[en]=temp;
            st++;
            en--;
        }
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        helper(nums,0,nums.length-1);
        helper(nums,0,k-1);
        helper(nums,k,nums.length-1);
    }
}