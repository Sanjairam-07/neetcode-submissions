class Solution {
    public int missingNumber(int[] nums) {
        int t=nums.length,sum=0;
        for(int i=0;i<nums.length;i++){
            t+=i;
            sum+=nums[i];
        }
        return t-sum;
    }
}
